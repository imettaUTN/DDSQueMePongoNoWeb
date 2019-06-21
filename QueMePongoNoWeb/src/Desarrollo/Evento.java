package Desarrollo;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

@Data
public class Evento {
	
	private LocalDate fechaAlta;
	private LocalDate fechaEvento;
	private int temperatura;
	private Sugerencia sugerencia;
	private EnumEstadoEvento estado;
	private InvokerGestorEvento invoker;
	private Usuario usuario;
	private Guardarropa guardaropaAsociado;
	private UbicacionEvento ubicacion;
	
	
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public LocalDate getFechaEvento() {
		return fechaEvento;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public Sugerencia getSugerencia() {
		return sugerencia;
	}

	public EnumEstadoEvento getEstado() {
		return estado;
	}

	public InvokerGestorEvento getInvoker() {
		return invoker;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Guardarropa getGuardaropaAsociado() {
		return guardaropaAsociado;
	}

	public UbicacionEvento getUbicacion() {
		return ubicacion;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public void setSugerencia(Sugerencia sugerencia) {
		this.sugerencia = sugerencia;
	}

	public void setEstado(EnumEstadoEvento estado) {
		this.estado = estado;
	}

	public void setInvoker(InvokerGestorEvento invoker) {
		this.invoker = invoker;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setGuardaropaAsociado(Guardarropa guardaropaAsociado) {
		this.guardaropaAsociado = guardaropaAsociado;
	}

	public void setUbicacion(UbicacionEvento ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Sugerencia ProcesarEvento(Date fecha) {
		
			return sugerencia;
		
	}
	
	public void nuevoEvento(LocalDate fechaEvento, Usuario usuario, UbicacionEvento ubicacion){
		
			EnumEstadoEvento NUEVO = null;
			
			this.fechaEvento = fechaEvento;
			this.usuario = usuario;
			this.ubicacion = ubicacion;
			
			this.fechaAlta = LocalDate.now();
			this.setTemperatura(0);
			this.estado = NUEVO;
			this.guardaropaAsociado = null;
	}
	
}
