package Desarrollo;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Data
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
	
	public boolean agregarPrenda(Prenda prenda){
		
		if(maximoPrendas > 0) {
			
			this.prendasDisponibles.add(prenda);
			return true;
		}
		
		return false;
	}
	
	

}
