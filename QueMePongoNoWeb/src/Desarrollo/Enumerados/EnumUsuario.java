package Desarrollo.Enumerados;
import lombok.*;

@Getter
public enum EnumUsuario {
	
	Premium("Usuario Premium",200), 
	Gratuito("Usuario Gratuito",50); 
	
	private String descripcion;
	private int CantidadMaximaPrenda;
	
	private EnumUsuario (String descripcion, int CantidadMaximaPrenda){
		this.CantidadMaximaPrenda = CantidadMaximaPrenda;
		this.descripcion = descripcion;
	}

}
