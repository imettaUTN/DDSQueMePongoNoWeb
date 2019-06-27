package Testing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import Desarrollo.*;
import Desarrollo.Enumerados.EnumCapa;
import Desarrollo.Enumerados.EnumCategoria;

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
	private Prenda prendaSiete = new Prenda();
	
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
		prenda.setNumeroCapa(EnumCapa.Primera);
		
		prenda.setUrlImagen("Nada");

		//Prenda Remera Dos
		prendaDos.setColorPrimario("Azul");
		prendaDos.setColorSecundario("Amarillo");
		prendaDos.setTipoPrenda(remera);
		prendaDos.setTela("Seda");
				
		prendaDos.setCategoria(Superior);
		prendaDos.setNumeroCapa(EnumCapa.Primera);
		
		prendaDos.setUrlImagen("Nada");		
		
		//Prenda Camisa Uno
		prendaTres.setColorPrimario("Rojo");
		prendaTres.setColorSecundario("No");
		prendaTres.setTipoPrenda(camisa);
		prendaTres.setTela("Jean");
		
		prendaTres.setCategoria(Superior);
		prendaTres.setNumeroCapa(EnumCapa.Primera);
		prendaTres.setUrlImagen("Nada");
		
		// Prenda Pantalon Uno
		
		prendaCuatro.setColorPrimario("Negro");
		prendaCuatro.setColorSecundario("Vacio");
		prendaCuatro.setTipoPrenda(pantalon);
		
		prendaCuatro.setCategoria(Inferior);
		prendaCuatro.setNumeroCapa(EnumCapa.Primera);
			prendaCuatro.setUrlImagen("Vacio");
		
		// Prenda Zapatilla Uno
		
		prendaCinco.setColorPrimario("Amarillas");
		prendaCinco.setColorSecundario("Negro");
		prendaCinco.setTipoPrenda(zapatilla);
		
		prendaCinco.setCategoria(Calzado);
		prendaCinco.setNumeroCapa(EnumCapa.Primera);
	//	prendaCinco.setDisponibleParaSugerir(true);
		prendaCinco.setUrlImagen("");
		
		// Prenda Zapatilla Dos
		
		prendaSiete.setColorPrimario("Verde");
		prendaSiete.setColorSecundario("Azul");
		prendaSiete.setTipoPrenda(zapatilla);
		
		prendaSiete.setCategoria(Calzado);
		prendaSiete.setNumeroCapa(EnumCapa.Primera);
		//prendaSiete.setDisponibleParaSugerir(true);
		prendaSiete.setUrlImagen("Ejemplo");
		
		// Prenda Lentes Uno
		
		prendaSeis.setColorPrimario("Gris");
		prendaSeis.setColorSecundario("Rojo");
		prendaSeis.setTipoPrenda(lentes);
		
		prendaSeis.setCategoria(Accesorio);
		prendaSeis.setNumeroCapa(EnumCapa.Primera);
		//prendaSeis.setDisponibleParaSugerir(true);
		prendaSeis.setUrlImagen("");
		
		/*
		
		//Guardarropa
		guardarropa.setMaximoPrendas(10);
		guardarropa.setGuardarropasCompartido(false);
		guardarropa.getParteSuperior().add(prenda);
		guardarropa.getParteSuperior().add(prendaDos);
		guardarropa.getParteSuperior().add(prendaTres);
		guardarropa.getParteInferior().add(prendaCuatro);
		guardarropa.getCalzados().add(prendaCinco);
		guardarropa.getAccesorios().add(prendaSeis);
		guardarropa.getCalzados().add(prendaSiete);
		*/
		
	}
	
	
	
	@Test
	public void cantidadDeGuardarropas(){
		
		Assert.assertEquals(0, guardarropa.cantidadDePrendas());
		
	}
	

	@Test
	public void cantidadDeSugerencias() throws IOException{
		
		sugerencias = guardarropa.algortimoDeRecomendacion(1,3);
		
		Assert.assertEquals(6, sugerencias.size());
		
	}
	
}
