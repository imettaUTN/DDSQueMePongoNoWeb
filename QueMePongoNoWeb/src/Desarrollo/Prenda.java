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
	private boolean disponibleParaSugerir = true;
	
	public String getColorPrimario() {
		return colorPrimario;
	}

	public String getColorSecundario() {
		return colorSecundario;
	}

	public TipoPrenda getTipoPrenda() {
		return tipoPrenda;
	}

	public String getTela() {
		return tela;
	}

	public EnumCategoria getCategoria() {
		return categoria;
	}

	public int getNumeroCapa() {
		return numeroCapa;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public boolean isDisponibleParaSugerir() {
		return disponibleParaSugerir;
	}

	public void setColorPrimario(String colorPrimario) {
		this.colorPrimario = colorPrimario;
	}

	public void setColorSecundario(String colorSecundario) {
		this.colorSecundario = colorSecundario;
	}

	public void setTipoPrenda(TipoPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public void setCategoria(EnumCategoria categoria) {
		this.categoria = categoria;
	}

	public void setNumeroCapa(int numeroCapa) {
		this.numeroCapa = numeroCapa;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public void SetDisponibleParaSugerir() {
		this.disponibleParaSugerir = true;
	}

	public void BoquearPrenda() {
		this.disponibleParaSugerir = false;
	}
	
	public void visualizar(){
		
		System.out.print(" Prenda: " + tipoPrenda.getDescripcion() + " - Color Primario: " + colorPrimario + " - Color Secundario: " + colorSecundario + "\n");
		
	}
}
