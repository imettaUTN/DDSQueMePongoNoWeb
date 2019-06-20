import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Getter
@Setter

public class Guardarropa {
	
	private List<Prenda> prendasDisponibles = new ArrayList<Prenda>();
	private int maximoPrendas;
	private boolean guardarropasCompartido;
	private List<Usuario> usuariosCompartiendo = new ArrayList<Usuario>();
		
	//Genera la sugerencia
	public Sugerencia GenerarSugerencia(){
			//List<Prenda> sugerencia = new ArrayList<Prenda>();
			Sugerencia sugerencia = new Sugerencia();
			return sugerencia;
	}

}
