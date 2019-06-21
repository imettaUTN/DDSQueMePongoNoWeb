package Desarrollo;
import lombok.*;

@Data
public class Prenda {

	private String colorPrimario;
	private String colorSecundario;
	private TipoPrenda tipoPrenda;
	private String tela;
	private EnumCategoria categoria;
	private int numeroCapa;
	private String urlImagen;
	private boolean disponibleParaSugerir;
	
	public boolean esCategoria(EnumCategoria categoria){
		
		if(this.categoria == categoria)
			return true;
		
		return false;
	}
	
	public void visualizar(){
		
		System.out.print(" Prenda: " + tipoPrenda.getDescripcion() + " - Color Primario: " + colorPrimario + " - Color Secundario: " + colorSecundario + "\n");
		
	}
}
