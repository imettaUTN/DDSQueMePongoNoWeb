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
