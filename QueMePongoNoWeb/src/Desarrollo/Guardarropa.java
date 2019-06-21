package Desarrollo;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Data
public class Guardarropa {
	
	private List<Prenda> prendasDisponibles = new ArrayList<Prenda>();
	private int maximoPrendas;
	private boolean guardarropasCompartido;
	private List<Usuario> usuariosCompartiendo = new ArrayList<Usuario>();
	
	private List<Prenda> parteSuperior = new ArrayList<Prenda>();
	private List<Prenda> parteInferior = new ArrayList<Prenda>();
	private List<Prenda> accesorios = new ArrayList<Prenda>();
	private List<Prenda> calzados = new ArrayList<Prenda>();
		
	public Sugerencia GenerarSugerencia(int temperatura){
	
		EnumEstadoSugerencia NUEVO = null;
		Sugerencia sugerencia = new Sugerencia();
		sugerencia.setEstado(NUEVO);
		return sugerencia;
	}
	
	public boolean agregarPrenda(Prenda prenda){
		
		if(maximoPrendas > 0) {
			
			switch(prenda.getCategoria()){
			
				case Superior:
					
					this.parteSuperior.add(prenda);
					
				case Inferior:
					
					this.parteInferior.add(prenda);
					
				case Calzado:
					
					this.calzados.add(prenda);
					
				case Accesorio:	
					
					this.calzados.add(prenda);
			}
			
			return true;
		}
		
		return false;
	}
	
	public int cantidadDePrendas() {
		
		return this.prendasDisponibles.size();
	}
	
	public List<Sugerencia> algortimoDeRecomendacion(){
		
		List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
		
		for(Prenda prendaSuperior:parteSuperior){
			
			for(Prenda prendaInferior:parteInferior){
				
				for(Prenda calzado:calzados){
					
					for(Prenda accesorio:accesorios){
						
						Sugerencia sugerencia = new Sugerencia();
						sugerencia.agregarPrenda(prendaSuperior);
						sugerencia.agregarPrenda(prendaInferior);
						sugerencia.agregarPrenda(calzado);
						sugerencia.agregarPrenda(accesorio);
						sugerencias.add(sugerencia);
					}
				}
			}
		}
		
		return sugerencias;
	}
	
}
