package Desarrollo;

import java.io.IOException;

public class CommandObtenerClima implements IComand {

	@Override
	public void Execute(Evento evento) throws IOException {
		
		ProxyApiClima proxy = new ProxyApiClima();
		Clima clima = proxy.ObtenerTemperatura(evento.getFechaEvento(),evento.getUbicacion());
		evento.setTemperaturaMaxima(clima.getTemperaturaMaxima());
		evento.setTemperaturaMinima(clima.getTemperaturaMinima());
		
	}

}
