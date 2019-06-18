import java.util.*;

public class TipoPrenda {
private List<String> telasValidas = new ArrayList<String>();
private int nivelAbrigo ;

public void AddTelaValida(String tela) {
	this.telasValidas.add(tela);	
}

public int getNivelAbrigo() {
	return nivelAbrigo;
}
public void setNivelAbrigo(int nivelAbrigo) {
	this.nivelAbrigo = nivelAbrigo;
}

public boolean IsTelaValida(String tela) {
	return this.telasValidas.contains(tela);
}

}
