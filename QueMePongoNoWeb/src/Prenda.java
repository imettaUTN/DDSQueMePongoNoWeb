
public class Prenda {
private String colorPrimario;
private String colorSecundario;
private TipoPrenda tipoPrenda;
private String tela;
private EnumCategoria categoria;
private int numeroCapa;
private String urlImagen;
private boolean disponibleParaSugerir;

public String getColorPrimario() {
	return colorPrimario;
}
public void setColorPrimario(String colorPrimario) {
	this.colorPrimario = colorPrimario;
}
public String getColorSecundario() {
	return colorSecundario;
}
public void setColorSecundario(String colorSecundario) {
	this.colorSecundario = colorSecundario;
}
public TipoPrenda getTipoPrenda() {
	return tipoPrenda;
}
public void setTipoPrenda(TipoPrenda tipoPrenda) {
	this.tipoPrenda = tipoPrenda;
}
public String getTela() {
	return tela;
}
public void setTela(String tela) {
	this.tela = tela;
}
public EnumCategoria getCategoria() {
	return categoria;
}
public void setCategoria(EnumCategoria categoria) {
	this.categoria = categoria;
}
public int getNumeroCapa() {
	return numeroCapa;
}
public void setNumeroCapa(int numeroCapa) {
	this.numeroCapa = numeroCapa;
}
public String getUrlImagen() {
	return urlImagen;
}
public void setUrlImagen(String urlImagen) {
	this.urlImagen = urlImagen;
}
public boolean isDisponibleParaSugerir() {
	return disponibleParaSugerir;
}
public void setDisponibleParaSugerir(boolean disponibleParaSugerir) {
	this.disponibleParaSugerir = disponibleParaSugerir;
}

}
