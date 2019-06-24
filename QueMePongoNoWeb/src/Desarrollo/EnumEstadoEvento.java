package Desarrollo;

public enum EnumEstadoEvento {
	
	NUEVO("Nuevo aun no procesado",1),
	ENPROCESO("Procesando evento, se le asignas sugerencias.",2),
	PROCESADO("Evento al que el usuario le asigno una sugerencia o la rechazo.",3),
	CANCELADO("Evento Cancelado.",4),
	FINALIZADO("Evento finalizado.",5),
	ACTUALIZADO("Evento cuyo clima cambio.",6);
	
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
