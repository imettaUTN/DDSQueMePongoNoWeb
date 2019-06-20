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
	

}
