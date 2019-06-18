import java.util.*;

public class Usuario {
private String nombre;
private String apellido;
private String password;
private EnumUsuario tipoUsuario;
private List<Guardaropa> guardarropas = new ArrayList<Guardaropa>();
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public EnumUsuario getTipoUsuario() {
	return tipoUsuario;
}
public void setTipoUsuario(EnumUsuario tipoUsuario) {
	this.tipoUsuario = tipoUsuario;
}
public List<Guardaropa> getGuardarropas() {
	return guardarropas;
}
public void setGuardarropas(List<Guardaropa> guardarropas) {
	this.guardarropas = guardarropas;
}

public Guardaropa GetPrimerGuardaropa() {
	return this.guardarropas.get(0);
}
}
