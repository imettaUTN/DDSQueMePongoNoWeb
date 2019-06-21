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
		EnumEstadoEvento ENPROCESO = null;
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
						sugerencia.agregarPrendaSeleccionada(prendaSuperior);
						sugerencia.agregarPrendaSeleccionada(prendaInferior);
						sugerencia.agregarPrendaSeleccionada(calzado);
						sugerencia.agregarPrendaSeleccionada(accesorio);
						sugerencias.add(sugerencia);
					}
				}
			}
		}
		
		return sugerencias;
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

	public List<Prenda> getParteSuperior() {
		return parteSuperior;
	}

	public List<Prenda> getParteInferior() {
		return parteInferior;
	}

	public List<Prenda> getAccesorios() {
		return accesorios;
	}

	public List<Prenda> getCalzados() {
		return calzados;
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

	public void setUsuariosCompartiendo(List<Usuario> usuariosCompartiendo) {
		this.usuariosCompartiendo = usuariosCompartiendo;
	}

	public void setParteSuperior(List<Prenda> parteSuperior) {
		this.parteSuperior = parteSuperior;
	}

	public void setParteInferior(List<Prenda> parteInferior) {
		this.parteInferior = parteInferior;
	}

	public void setAccesorios(List<Prenda> accesorios) {
		this.accesorios = accesorios;
	}

	public void setCalzados(List<Prenda> calzados) {
		this.calzados = calzados;
	}
	
}
