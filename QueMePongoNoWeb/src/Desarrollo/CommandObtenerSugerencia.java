package Desarrollo;

import java.io.IOException;

public class CommandObtenerSugerencia implements IComand {

	@Override
	public void Execute(Evento evento) throws IOException  {
	
				
		Guardarropa guardaropaAsociado = evento.getGuardaropaAsociado();
		evento.setSugerencias(guardaropaAsociado.GenerarSugerencia(evento.getTemperaturaMinima(), evento.getTemperaturaMaxima()));
		
		evento.setEstado(EnumEstadoEvento.ENPROCESO);
	}

}