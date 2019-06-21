package Desarrollo;
import java.util.*;
import lombok.*;

@Data
public class TipoPrenda {
	
	private List<String> telasValidas = new ArrayList<String>();
	private int nivelAbrigo;
	private String descripcion;
	
	public boolean IsTelaValida(String tela) {
		return this.telasValidas.contains(tela);
	}
	
	public void agregarTelaValida(String tela){
		
		this.telasValidas.add(tela);
	}
}
