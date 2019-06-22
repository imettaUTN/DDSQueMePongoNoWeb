package Desarrollo;
import java.io.IOException;
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
	public void ProcesarEvento(Evento evento) throws IOException {
		InvokerGestorEvento invoke = new InvokerGestorEvento();
		invoke.SettearSugerencia(evento);
	}
	
	public void agregarPrendaAGuardarropa(Prenda prenda, int guardarropa){
		
		this.getGuardarropas().get(guardarropa).agregarPrenda(prenda);
		
	}
	
	public void aceptarSugerencia(Sugerencia sugerencia){
		sugerencia.AceptarSugerencia();
	}
	
	public void rechazarSugerencia(Sugerencia sugerencia){
		
		sugerencia.RechazarSugerencia();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getPassword() {
		return password;
	}

	public EnumUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public List<Guardarropa> getGuardarropas() {
		return guardarropas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTipoUsuario(EnumUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public void setGuardarropas(List<Guardarropa> guardarropas) {
		this.guardarropas = guardarropas;
	}
	
}
