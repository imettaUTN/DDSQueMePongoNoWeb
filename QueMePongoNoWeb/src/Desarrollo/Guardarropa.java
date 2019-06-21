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
		
	//Genera la sugerencia
	public Sugerencia GenerarSugerencia(){
	
		//List<Prenda> sugerencia = new ArrayList<Prenda>();
		Sugerencia sugerencia = new Sugerencia();
		
		return sugerencia;
	}
	
	public boolean agregarPrenda(Prenda prenda){
		
		if(maximoPrendas > 0) {
			
			this.prendasDisponibles.add(prenda);
			return true;
		}
		
		return false;
	}
	
	public int cantidadDePrendas() {
		
		return this.prendasDisponibles.size();
	}
	
	public List<Sugerencia> algortimoDeRecomendacion(){
		
		List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
		
		int i=0, j=0, k=0, l=0, contador=0;
		EnumEstadoSugerencia NUEVO = null;
		
		int cantidadParteSuperior =this.parteSuperior.size();
		int cantidadParteInferior =this.parteInferior.size();
		int cantidadCalzados =this.calzados.size();
		int cantidadAccesorios =this.accesorios.size();
		
		for(i=0;i<cantidadParteSuperior;i++){
			
			for(j=0;i<cantidadParteInferior;j++){
				
				for(k=0;i<cantidadCalzados;k++){
					
					for(l=0;i<cantidadAccesorios;l++){
						
						Sugerencia sugerencia = new Sugerencia();
						
						sugerencia.agregarPrenda(this.parteSuperior.get(i));
						sugerencia.agregarPrenda(this.parteInferior.get(j));
						sugerencia.agregarPrenda(this.calzados.get(k));
						sugerencia.agregarPrenda(this.accesorios.get(l));
						
						sugerencia.setEstado(NUEVO);
						
						sugerencias.add(sugerencia);
					}
				}
			}
		}
		
		return sugerencias;
	}
	
	
	
}
