import java.util.*;
import lombok.*;

@Getter
@Setter
public class Usuario {

	private String nombre;
	private String apellido;
	private String password;
	private EnumUsuario tipoUsuario;
	private List<Guardaropa> guardarropas = new ArrayList<Guardaropa>();


	public Guardaropa GetPrimerGuardaropa() {
		return this.guardarropas.get(0);
	}

}
