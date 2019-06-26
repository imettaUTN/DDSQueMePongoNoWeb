package Desarrollo;
import java.io.IOException;
import Desarrollo.*;
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
	private List<Evento> eventos = new ArrayList<Evento>();
	
	public void CargarEvento(LocalDate fecha, UbicacionEvento ubicacion) throws Exception{
		
		Evento evento = new Evento();
		evento.nuevoEvento(fecha,this, ubicacion);
		evento.ProcesarEvento();
	}
	
	
	public boolean agregarPrendaAGuardarropa(Prenda prenda, int guardarropa){
		
		return this.getGuardarropas().get(guardarropa).agregarPrenda(prenda);
		
	}
	
	public void aceptarSugerencia(Sugerencia sugerencia, Evento evento){
		
		for(Sugerencia sg : evento.getSugerencias()) {
			if(sg.getIdSugerencia() != sugerencia.getIdSugerencia()) {
				sugerencia.RechazarSugerencia();
			}
			else {
				sugerencia.AceptarSugerencia();
				evento.setSugerenciaSeleccionada(sugerencia);
			}
		}
		
	}
	
	public void rechazarSugerencia(Sugerencia sugerencia){
		
		sugerencia.RechazarSugerencia();
	}
	
   public int cantidadDeGuardarropas() {
		
		return this.guardarropas.size();
		
	}
	
	
	public void eliminarGuardarropa(int guardarropa){
		
		this.guardarropas.remove(guardarropa);
		
	}
	

	public void crearGuardarropa(){
		
		Guardarropa nuevoGuardarropa = new Guardarropa();
		
		if(this.tipoUsuario == EnumUsuario.Premium){
			
			nuevoGuardarropa.setMaximoPrendas(-1);
		
		}else{
			
			nuevoGuardarropa.setMaximoPrendas(50);
		}
		
		this.guardarropas.add(nuevoGuardarropa);
		
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
