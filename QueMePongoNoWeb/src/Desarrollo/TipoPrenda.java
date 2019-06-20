package Desarrollo;
import java.util.*;
import lombok.*;

@Getter
@Setter
public class TipoPrenda {
	
	private List<String> telasValidas = new ArrayList<String>();
	private int nivelAbrigo ;
	
	public boolean IsTelaValida(String tela) {
		return this.telasValidas.contains(tela);
	}

}
