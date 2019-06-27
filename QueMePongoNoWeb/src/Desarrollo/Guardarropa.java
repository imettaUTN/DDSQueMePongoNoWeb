package Desarrollo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Desarrollo.Enumerados.EnumCategoria;
import Desarrollo.Enumerados.EnumEstadoSugerencia;
import lombok.*;

@Data
public class Guardarropa {
	
	private int id;
	private List<Prenda> prendasDisponibles = new ArrayList<Prenda>();
	private int maximoPrendas;	
	private String descripcion;
	private boolean guardarropasCompartido;
	private int nivelesALlenar = 0;
	private List<Usuario> usuariosCompartiendo = new ArrayList<Usuario>();
	

	public List<Sugerencia> GenerarSugerencia(int temperaturaMinima, int temperaturaMaxima) throws IOException{
			
			return algortimoDeRecomendacion(temperaturaMinima,temperaturaMaxima); 
		
	}
	
	
	public boolean agregarPrenda(Prenda prenda){
		
			
		if(cantidadDePrendas() <= maximoPrendas) {
			
			prendasDisponibles.add(prenda);
			return true;
		}
		
		return false;
	}
	
	public int cantidadDePrendas() {
		
		return this.prendasDisponibles.size();
	}
	
	public List<Sugerencia> algortimoDeRecomendacion(int temperaturaMaxima, int temperaturaMinima) throws IOException{
		
		List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
		List<Prenda> parteSuperior = (List<Prenda>) this.prendasDisponibles.stream().filter(p->p.esSuperior());
		List<Prenda> parteInferior = (List<Prenda>) this.prendasDisponibles.stream().filter(p->p.esInferior());
		List<Prenda> calzados = (List<Prenda>) this.prendasDisponibles.stream().filter(p->p.esCalzado());
		List<Prenda> accesorios = (List<Prenda>) this.prendasDisponibles.stream().filter(p->p.esAccesorio());
		
		
		for(Prenda prendaSuperior:parteSuperior){
			if(nivelesALlenar == 0) {
			nivelesALlenar = GetNivelAbrigoByCategoria(EnumCategoria.Superior,temperaturaMinima,temperaturaMaxima);}
			Sugerencia sugerencia = new Sugerencia();
			sugerencia.agregarPrendaSeleccionada(prendaSuperior);
			nivelesALlenar --;
			if(nivelesALlenar <= 0) {
				
				for(Prenda prendaInferior:parteInferior){
					if(nivelesALlenar == 0) {
						nivelesALlenar = GetNivelAbrigoByCategoria(EnumCategoria.Inferior,temperaturaMinima,temperaturaMaxima);}
					sugerencia.agregarPrendaSeleccionada(prendaInferior);
					nivelesALlenar --;
					if(nivelesALlenar <= 0) {
							if((EsColorCombinable(prendaSuperior.getColorPrimario(), prendaInferior.getColorSecundario())) &&
									(EsColorCombinable(prendaInferior.getColorPrimario(), prendaSuperior.getColorSecundario())))
							{									
								for(Prenda calzado:calzados){									
										sugerencia.agregarPrendaSeleccionada(calzado);
										if((EsColorCombinable(prendaSuperior.getColorPrimario(), calzado.getColorSecundario())) &&
												(EsColorCombinable(calzado.getColorPrimario(), prendaSuperior.getColorSecundario())) &&
												(EsColorCombinable(prendaInferior.getColorPrimario(), calzado.getColorSecundario())) &&
												(EsColorCombinable(calzado.getColorPrimario(), prendaInferior.getColorSecundario()))
											)	
										{
										
											for(Prenda accesorio:accesorios){
											if((EsColorCombinable(prendaSuperior.getColorPrimario(), accesorio.getColorSecundario())) &&
													(EsColorCombinable(accesorio.getColorPrimario(), prendaSuperior.getColorSecundario())) &&
													(EsColorCombinable(prendaInferior.getColorPrimario(), accesorio.getColorSecundario())) &&
													(EsColorCombinable(accesorio.getColorPrimario(), prendaInferior.getColorSecundario())) &&
													(EsColorCombinable(calzado.getColorPrimario(), accesorio.getColorSecundario())) &&
													(EsColorCombinable(accesorio.getColorPrimario(), calzado.getColorSecundario())) 
											)
											{
												sugerencia.agregarPrendaSeleccionada(accesorio);
												sugerencia.setEstado(EnumEstadoSugerencia.NUEVO);
												sugerencias.add(sugerencia);
											}
										}
									}
							   }
							}
					}
				}
			}
		}
		
		return sugerencias;
	}

	private int GetNivelAbrigoByCategoria(EnumCategoria categoria, int temperaturaMinima, int temperaturaMaxima) throws IOException {
		for(Parametros par: Testing.TestLeerArchivoJson.JsonToParametros()) {
			if(par.getCategoria().equals(categoria) && par.getRangoTemperaturaDesde() >= temperaturaMinima && par.getRangoTemperaturaHasta() <= temperaturaMaxima) {
				return par.getNivelAbrigoDeseado();
			}
		}
		return 0;
	}
	
	private boolean EsColorCombinable(String colorPrimario, String colorSecundario) {
		
		if(colorPrimario.equals("ROJO")) {
			return colorSecundario.equals("BLANCO") || colorSecundario.equals("NEGRO") || colorSecundario.equals("GRIS") || colorSecundario.equals("AMARILLO") || colorSecundario.equals("BEIGE") ;
		}
		if(colorPrimario.equals("AMARILLO")) {
			return colorSecundario.equals("BLANCO") || colorSecundario.equals("NEGRO") || colorSecundario.equals("GRIS") || colorSecundario.equals("AZUL") || colorSecundario.equals("MORADO") || colorSecundario.equals("ROJO") ;
		}
		if(colorPrimario.equals("AZUL")) {
			return colorSecundario.equals("AMARILLO") || colorSecundario.equals("BLANCO") || colorSecundario.equals("NARANJA") || colorSecundario.equals("NARANJA") || colorSecundario.equals("MARRON")  || colorSecundario.equals("VERDE") || colorSecundario.equals("ROJO") ;
		}
		if(colorPrimario.equals("BLANCO")) {
			return colorSecundario.equals("BLANCO");
		}
		if(colorPrimario.equals("NEGRO")) {
			return colorSecundario.equals("NEGRO");
		}
		
		return false;		
	}
	
	public List<Prenda> getPrendasDisponibles() {
		return prendasDisponibles;
	}

	public int getMaximoPrendas() {
		return maximoPrendas;
	}

	public boolean isGuardarropasCompartido() {
		return guardarropasCompartido;
	}

	public List<Usuario> getUsuariosCompartiendo() {
		return usuariosCompartiendo;
	}


	public void setPrendasDisponibles(List<Prenda> prendasDisponibles) {
		this.prendasDisponibles = prendasDisponibles;
	}

	public void setMaximoPrendas(int maximoPrendas) {
		this.maximoPrendas = maximoPrendas;
	}

	public void setGuardarropasCompartido(boolean guardarropasCompartido) {
		this.guardarropasCompartido = guardarropasCompartido;
	}

	public void AddUsuariosCompartiendo(Usuario usuarioCompartiendo) {
		this.usuariosCompartiendo.add(usuarioCompartiendo);
	}
	
	public void generarSugerencias(int nivelDeAbrigo){
		
		List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
		List<Prenda> parteSuperior = (List<Prenda>) this.prendasDisponibles.stream().filter(p->p.esSuperior() && p.esNivelDeAbrigo(nivelDeAbrigo));
		List<Prenda> parteInferior = (List<Prenda>) this.prendasDisponibles.stream().filter(p->p.esInferior() && p.esNivelDeAbrigo(nivelDeAbrigo));
		List<Prenda> calzados = (List<Prenda>) this.prendasDisponibles.stream().filter(p->p.esCalzado() && p.esNivelDeAbrigo(nivelDeAbrigo));
		List<Prenda> accesorios = (List<Prenda>) this.prendasDisponibles.stream().filter(p->p.esAccesorio() && p.esNivelDeAbrigo(nivelDeAbrigo));
		
		
		for(Prenda prendaSuperior: parteSuperior){
			
			Sugerencia sugerencia = new Sugerencia();
			sugerencia.agregarPrendaSeleccionada(prendaSuperior);
			
				for(Prenda prendaInferior:parteInferior){
					
					sugerencia.agregarPrendaSeleccionada(prendaInferior);
	
						for(Prenda calzado:calzados){
							
							sugerencia.agregarPrendaSeleccionada(calzado);
								
								for(Prenda accesorio:accesorios){
									
									sugerencia.agregarPrendaSeleccionada(accesorio);
									sugerencias.add(sugerencia);
									
								}
						}
				}
		}
	}

	
	
}
