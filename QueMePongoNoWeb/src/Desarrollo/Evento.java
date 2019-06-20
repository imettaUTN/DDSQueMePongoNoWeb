package Desarrollo;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

@Getter
@Setter
public class Evento {
	
	private LocalDate fechaEvento;
	private int temperatura;
	private Sugerencia sugerencia;
	private EnumEstadoEvento estado;
	private InvokerGestorEvento invoker;
	private Usuario usuario;
	private Guardarropa guardaropaAsociado;
	private int latitudEvento, longitudEvento;
	private String paisEvento,ciudadEvento, provinciaEvento;
	
	public Sugerencia ProcesarEvento(Date fecha) {
		
			return sugerencia;
		
	}
	
	
	
}
