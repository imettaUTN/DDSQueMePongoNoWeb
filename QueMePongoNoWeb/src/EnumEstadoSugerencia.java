
public enum EnumEstadoSugerencia {
NUEVO("NUEVA SUGERENCIA",1),ACEPTADA("SUGERENCIA ACEPTADA",2),RECHAZADA("SUGERENCIA RECHAZADA",3);

private int id;
private String descripcion;
private EnumEstadoSugerencia( String descripcion,int id) {
	this.id = id;
	this.descripcion = descripcion;
}

public int GetId() {
	return this.id;
}
public String GetDescripcion() {
	return this.descripcion;
}
}