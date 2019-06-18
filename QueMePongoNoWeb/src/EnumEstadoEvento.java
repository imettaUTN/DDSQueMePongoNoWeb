
public enum EnumEstadoEvento {
NUEVO("Nuevo aun no procesado",1),
ENPROCESO("Procesando evento",2),
CANCELADO("Evento Cancelado",3),
FINALIZADO("Evento finalizado",4),
CLIMAMODIFICADO("Evento cuyo clima cambio",5);

private String descripcion;
private int id;

private EnumEstadoEvento(String descripcion, int id) {
	this.descripcion = descripcion;
	this.id = id;
}

public String GetDescripcion() {
	return this.descripcion;
}

public int GetId() {
	return this.id;
}
}
