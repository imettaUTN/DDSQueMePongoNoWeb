package Testing;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import Desarrollo.*;

public class TestGuardarropas {
	
	private Guardarropa guardarropa = new Guardarropa();
	
	private TipoPrenda remera = new TipoPrenda();
	private TipoPrenda camisa = new TipoPrenda();
	private TipoPrenda pantalon = new TipoPrenda();
	private TipoPrenda zapatilla = new TipoPrenda();
	private TipoPrenda lentes = new TipoPrenda();
	
	private Prenda prenda = new Prenda();
	private Prenda prendaDos = new Prenda();
	private Prenda prendaTres = new Prenda();
	private Prenda prendaCuatro = new Prenda();
	private Prenda prendaCinco = new Prenda();
	private Prenda prendaSeis = new Prenda();
	
	List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();

	EnumCategoria Superior;
	EnumCategoria Inferior;
	EnumCategoria Calzado;
	EnumCategoria Accesorio;
	
	@Before
	public void init(){
		
		//Tipo de Prenda: Remera
		
		remera.setNivelAbrigo(1);
		remera.agregarTelaValida("Jersey");
		remera.agregarTelaValida("Modal");
		
		//Tipo de Prenda: Camisa
		
		camisa.setNivelAbrigo(2);
		camisa.agregarTelaValida("Jean");
		camisa.agregarTelaValida("Bambula");
		
		//Tipo de Prenda: Pantalon
		
		pantalon.setNivelAbrigo(1);
		pantalon.agregarTelaValida("Jean");
		
		//Tipo de Prenda: Zapatilla
		
		zapatilla.setNivelAbrigo(1);
		zapatilla.agregarTelaValida("Cuero");
		
		//Tipo de Prenda: Lentes
		lentes.setNivelAbrigo(1);
		lentes.agregarTelaValida("Ninguna");
		
		//Prenda Remera Uno
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
		
		//Prenda Camisa Uno
		prendaTres.setColorPrimario("Rojo");
		prendaTres.setColorSecundario("No");
		prendaTres.setTipoPrenda(camisa);
		prendaTres.setTela("Jean");
		
		prendaTres.setCategoria(Superior);
		prendaTres.setNumeroCapa(1);
		prendaTres.setDisponibleParaSugerir(true);
		prendaTres.setUrlImagen("Nada");
		
		// Prenda Pantalon Uno
		
		prendaCuatro.setColorPrimario("Negro");
		prendaCuatro.setColorSecundario("Vacio");
		prendaCuatro.setTipoPrenda(pantalon);
		
		prendaCuatro.setCategoria(Inferior);
		prendaCuatro.setNumeroCapa(1);
		prendaCuatro.setDisponibleParaSugerir(true);
		prendaCuatro.setUrlImagen("Vacio");
		
		// Prenda Zapatilla Uno
		
		prendaCinco.setColorPrimario("Amarillas");
		prendaCinco.setColorSecundario("Negro");
		prendaCinco.setTipoPrenda(zapatilla);
		
		prendaCinco.setCategoria(Calzado);
		prendaCinco.setNumeroCapa(1);
		prendaCinco.setDisponibleParaSugerir(true);
		prendaCinco.setUrlImagen("");
		
		// Prenda Lentes Uno
		
		prendaSeis.setColorPrimario("Gris");
		prendaSeis.setColorSecundario("Rojo");
		prendaSeis.setTipoPrenda(lentes);
		
		prendaSeis.setCategoria(Accesorio);
		prendaSeis.setNumeroCapa(2);
		prendaSeis.setDisponibleParaSugerir(true);
		prendaSeis.setUrlImagen("");
		
		//Guardarropa
		guardarropa.setMaximoPrendas(10);
		guardarropa.setGuardarropasCompartido(false);
		guardarropa.getParteSuperior().add(prenda);
		guardarropa.getParteSuperior().add(prendaDos);
		guardarropa.getParteSuperior().add(prendaTres);
		guardarropa.getParteInferior().add(prendaCuatro);
		guardarropa.getCalzados().add(prendaCinco);
		guardarropa.getAccesorios().add(prendaSeis);
		
	}
	
	
	
	@Test
	public void cantidadDeGuardarropas(){
		
		Assert.assertEquals(0, guardarropa.cantidadDePrendas());
		
	}
	
	@Test
	public void cantidadDePrendasSuperiores(){
		
		Assert.assertEquals(3, guardarropa.getParteSuperior().size());
	} 
	
	@Test
	public void cantidadDePrendasInferiores(){
		
		Assert.assertEquals(1, guardarropa.getParteInferior().size());
		
	} 
	
	@Test
	public void cantidadDeCalzados(){
		
		Assert.assertEquals(1, guardarropa.getCalzados().size());
		
	} 
	
	@Test
	public void cantidadDeAccesorios(){
		
		Assert.assertEquals(1, guardarropa.getAccesorios().size());
		
	} 
	
	
	
	@Test
	public void cantidadDeSugerencias(){
		
		
		Assert.assertEquals(3, guardarropa.algortimoDeRecomendacion());
		
	}
	
}
