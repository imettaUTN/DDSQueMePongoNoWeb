package Desarrollo;
import java.util.*;
import lombok.*;

@Data
public class Sugerencia {
	
	private List<Prenda> sugerencia = new ArrayList<Prenda>();
	private EnumEstadoSugerencia estado;
    private int idSugerencia ;
	
	public int getIdSugerencia() {
		return idSugerencia;
	}

	public void setIdSugerencia(int idSugerencia) {
		this.idSugerencia = idSugerencia;
	}

	public void agregarPrendaSeleccionada(Prenda prenda){
		
		this.sugerencia.add(prenda);
	}
	
	public void visualizarSugerencia(int posicion){
		
		System.out.print("==== Inicio Sugerencia: " + posicion + " ==== \n\n");
		
			for(Prenda prenda:sugerencia){
				
				prenda.visualizar();
			}
		
		System.out.print("\n ==== Fin Sugerencia ==== \n\n");
	}

	public List<Prenda> getSugerencia() {
		return sugerencia;
	}

	public EnumEstadoSugerencia getEstado() {
		return estado;
	}

	public void setSugerencia(List<Prenda> sugerencia) {
		this.sugerencia = sugerencia;
	}

	public void setEstado(EnumEstadoSugerencia estado) {
		this.estado = estado;
	}
	public void AceptarSugerencia() {
		this.setEstado(EnumEstadoSugerencia.ACEPTADA);
		for(Prenda p : this.getSugerencia()) {
			p.BoquearPrenda();
		}
		
	}
	public void RechazarSugerencia() {
		this.setEstado(EnumEstadoSugerencia.RECHAZADA);
		for(Prenda p : this.getSugerencia()) {
			p.SetDisponibleParaSugerir();
		}
	}
}
