package Desarrollo;
import lombok.*;

@Getter
@Setter
public class NivelesDeAbrigo {
	
	private int nivelDeAbrigo;
	private String descripcion;
	private int temperaturaLimiteInferior;
	private int temperaturaLimiteSuperior;
	
	public int obtenerNivelDeAbrigo(int temperaturaMinima, int temperaturaMaxima){
		
		int temperaturaPromedio = (temperaturaMinima + temperaturaMaxima)/2;
		int nivel = 0;
		
		//Funcion para buscar en tabla de parametros;
		
		return nivel;
	
	}
	
}
