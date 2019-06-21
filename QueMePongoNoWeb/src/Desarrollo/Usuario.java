package Desarrollo;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

@Data
public class Usuario {

	private String nombre;
	private String apellido;
	private String password;
	private EnumUsuario tipoUsuario;
	private List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();
	
	public int cantidadDeGuardarropas() {
		
		return this.guardarropas.size();
		
	}
	
	public void agregarGuardarropa(Guardarropa guardarropa){
		
		this.guardarropas.add(guardarropa);
	}
	
	public void eliminarGuardarropa(int guardarropa){
		
		this.guardarropas.remove(guardarropa);
		
	}
	public void cargarEvento(LocalDate fecha, UbicacionEvento ubicacion){
		
		Evento evento = new Evento();
		evento.nuevoEvento(fecha,this, ubicacion);
	}
	
	public void agregarPrendaAGuardarropa(Prenda prenda, int guardarropa){
		
		this.getGuardarropas().get(guardarropa).agregarPrenda(prenda);
		
	}
	
	public void aceptarSugerencia(Sugerencia sugerencia){
		
		EnumEstadoSugerencia ACEPTADA = null;
		sugerencia.setEstado(ACEPTADA);
	}
	
	public void rechazarSugerencia(Sugerencia sugerencia){
		
		EnumEstadoSugerencia RECHAZADA = null;
		sugerencia.setEstado(RECHAZADA);
	}
	
}
