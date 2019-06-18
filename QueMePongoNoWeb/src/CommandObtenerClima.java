
public class CommandObtenerClima implements IComand {

	@Override
	public void Execute(Evento evento) {
		ProxyApiClima proxy = new ProxyApiClima();
	  evento.setTemperatura(proxy.GetTemperatura(evento.getFechaEvento(), evento.getLatitudEvento(), evento.getLongitudEvento(), evento.getCiudadEvento() ,evento.getProvinciaEvento(),evento.getPaisEvento()));
		
	}

}
