import java.util.ArrayList;
import java.util.List;

public class Guardaropa {
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

public List<Prenda> getPrendasDisponibles() {
	return prendasDisponibles;
}

public void setPrendasDisponibles(List<Prenda> prendasDisponibles) {
	this.prendasDisponibles = prendasDisponibles;
}

public int getMaximoPrendas() {
	return maximoPrendas;
}

public void setMaximoPrendas(int maximoPrendas) {
	this.maximoPrendas = maximoPrendas;
}

public boolean isGuardarropasCompartido() {
	return guardarropasCompartido;
}

public void setGuardarropasCompartido(boolean guardarropasCompartido) {
	this.guardarropasCompartido = guardarropasCompartido;
}

public List<Usuario> getUsuariosCompartiendo() {
	return usuariosCompartiendo;
}

public void setUsuariosCompartiendo(List<Usuario> usuariosCompartiendo) {
	this.usuariosCompartiendo = usuariosCompartiendo;
}
}
