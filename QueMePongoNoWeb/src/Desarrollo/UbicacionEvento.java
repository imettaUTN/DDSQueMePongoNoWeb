package Desarrollo;
import lombok.Data;

@Data
public class UbicacionEvento{
	
	private int latitudEvento;
	private int longitudEvento;
	private String paisEvento;
	private String ciudadEvento;
	private String provinciaEvento;
	public int getLatitudEvento() {
		return latitudEvento;
	}
	public void setLatitudEvento(int latitudEvento) {
		this.latitudEvento = latitudEvento;
	}
	public int getLongitudEvento() {
		return longitudEvento;
	}
	public void setLongitudEvento(int longitudEvento) {
		this.longitudEvento = longitudEvento;
	}
	public String getPaisEvento() {
		return paisEvento;
	}
	public void setPaisEvento(String paisEvento) {
		this.paisEvento = paisEvento;
	}
	public String getCiudadEvento() {
		return ciudadEvento;
	}
	public void setCiudadEvento(String ciudadEvento) {
		this.ciudadEvento = ciudadEvento;
	}
	public String getProvinciaEvento() {
		return provinciaEvento;
	}
	public void setProvinciaEvento(String provinciaEvento) {
		this.provinciaEvento = provinciaEvento;
	}
	
}
