import java.util.*;

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



public int getLatitudEvento() {
	return latitudEvento;
}
public void setLatitudEvento(int latitudEvento) {
	this.latitudEvento = latitudEvento;
}
public int getLongitudEvento() {
	return longitudEvento;
}
public void setLongitudEvento(int longitudEvento) {
	this.longitudEvento = longitudEvento;
}
public String getPaisEvento() {
	return paisEvento;
}
public void setPaisEvento(String paisEvento) {
	this.paisEvento = paisEvento;
}
public String getCiudadEvento() {
	return ciudadEvento;
}
public void setCiudadEvento(String ciudadEvento) {
	this.ciudadEvento = ciudadEvento;
}
public String getProvinciaEvento() {
	return provinciaEvento;
}
public void setProvinciaEvento(String provinciaEvento) {
	this.provinciaEvento = provinciaEvento;
}
public Guardaropa getGuardaropaAsociado() {
	return guardaropaAsociado;
}
public void setGuardaropaAsociado(Guardaropa guardaropaAsociado) {
	this.guardaropaAsociado = guardaropaAsociado;
}
public Date getFechaEvento() {
	return fechaEvento;
}
public void setFechaEvento(Date fechaEvento) {
	this.fechaEvento = fechaEvento;
}
public int getTemperatura() {
	return temperatura;
}
public void setTemperatura(int temperatura) {
	this.temperatura = temperatura;
}
public Sugerencia getSugerencia() {
	return sugerencia;
}
public void setSugerencia(Sugerencia sugerencia) {
	this.sugerencia = sugerencia;
}
public EnumEstadoEvento getEstado() {
	return estado;
}
public void setEstado(EnumEstadoEvento estado) {
	this.estado = estado;
}
public InvokerGestorEvento getInvoker() {
	return invoker;
}
public void setInvoker(InvokerGestorEvento invoker) {
	this.invoker = invoker;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
}
