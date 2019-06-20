package Desarrollo;
import lombok.*;

@Getter
public enum EnumUsuario {
	
	Premium("Usuario Premium",1), 
	Gratuito("Usuario Gratuito",2); 
	
	private String descripcion;
	private int idTipo;
	
	private EnumUsuario (String descripcion, int idTipo){
		this.idTipo = idTipo;
		this.descripcion = descripcion;
	}

}
