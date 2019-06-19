import java.util.*;
import lombok.*;

@Getter
@Setter
public class Evento {
	
	private Date fechaEvento;
	private int temperatura;
	private Sugerencia sugerencia;
	private EnumEstadoEvento estado;
	private InvokerGestorEvento invoker;
	private Usuario usuario;
	private Guardaropa guardaropaAsociado;
	private int latitudEvento, longitudEvento;
	private String paisEvento,ciudadEvento, provinciaEvento;
	
	public Sugerencia ProcesarEvento(Date fecha) {
		
		return sugerencia;
		
	}
	
	
	
}
