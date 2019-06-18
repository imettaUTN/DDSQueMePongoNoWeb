import java.util.*;

public class Sugerencia {
private List<Prenda> sugerencia = new ArrayList<Prenda>();
private EnumEstadoSugerencia estado;

public List<Prenda> getSugerencia() {
	return sugerencia;
}
public void setSugerencia(List<Prenda> sugerencia) {
	this.sugerencia = sugerencia;
}
public EnumEstadoSugerencia getEstado() {
	return estado;
}
public void setEstado(EnumEstadoSugerencia estado) {
	this.estado = estado;
}



}
