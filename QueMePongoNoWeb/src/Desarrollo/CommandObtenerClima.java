package Desarrollo;

public class CommandObtenerClima implements IComand {

	@Override
	public void Execute(Evento evento) {
		
		ProxyApiClima proxy = new ProxyApiClima();
		float temperatura = proxy.ObtenerTemperatura(evento.getFechaEvento(),evento.getUbicacion());
	}

}
