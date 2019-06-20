package Testing;
import org.junit.*;
import Desarrollo.*;

public class TestGuardarropas {
	
	private Guardarropa guardarropa = new Guardarropa();
	private TipoPrenda remera = new TipoPrenda();
	private Prenda prenda = new Prenda();
	private Prenda prendaDos = new Prenda();
	EnumCategoria Superior;
	
	@Before
	public void init(){
		
		//Tipo de Prenda
		remera.setNivelAbrigo(1);
		remera.agregarTelaValida("Jersey");
		remera.agregarTelaValida("Modal");
		
		//Prenda Remera
		prenda.setColorPrimario("Rojo");
		prenda.setColorSecundario("Vacio");
		prenda.setTipoPrenda(remera);
		prenda.setTela("Modal");
		
		prenda.setCategoria(Superior);
		prenda.setNumeroCapa(1);
		prenda.setDisponibleParaSugerir(true);
		prenda.setUrlImagen("Nada");

		//Prenda Remera Dos
		prendaDos.setColorPrimario("Azul");
		prendaDos.setColorSecundario("Amarillo");
		prendaDos.setTipoPrenda(remera);
		prendaDos.setTela("Seda");
				
		prendaDos.setCategoria(Superior);
		prendaDos.setNumeroCapa(1);
		prendaDos.setDisponibleParaSugerir(true);
		prendaDos.setUrlImagen("Nada");		
		
		//Guardarropa
		guardarropa.setMaximoPrendas(10);
		guardarropa.setGuardarropasCompartido(false);
		guardarropa.agregarPrenda(prenda);
		guardarropa.agregarPrenda(prendaDos);
		
	}
	
	@Test
	public void cantidadDeGuardarropas(){
		
		Assert.assertEquals(2, guardarropa.cantidadDePrendas());
		
	}
}
