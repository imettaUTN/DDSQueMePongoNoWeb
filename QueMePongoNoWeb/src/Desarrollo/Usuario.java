package Desarrollo;
import java.util.*;
import lombok.*;

@Data
public class Usuario {

	private String nombre;
	private String apellido;
	private String password;
	private EnumUsuario tipoUsuario;
	private List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();
	
	public Guardarropa GetPrimerGuardaropa() {
		
		return this.guardarropas.get(0);
	}
	
	public int cantidadDeGuardarropas() {
		
		return this.guardarropas.size();
		
	}
	
	public void agregarGuardarropa(Guardarropa guardarropa){
		
		this.guardarropas.add(guardarropa);
	}
	
	
	
	
}
