package Desarrollo;

public class CommandObtenerClima implements IComand {

	@Override
	public void Execute(Evento evento) {
		
		ProxyApiClima proxy = new ProxyApiClima();
		int temperatura = proxy.GetTemperatura(evento.getFechaEvento(),evento.getUbicacion());
	}

}
