package Desarrollo;

import java.io.IOException;

public class CommandObtenerSugerencia implements IComand {

	@Override
	public void Execute(Evento evento) throws IOException  {
	
				
		Guardarropa guardaropaAsociado = evento.getGuardaropaAsociado();
		evento.setSugerencia(guardaropaAsociado.GenerarSugerencia(evento.getTemperaturaMinima(), evento.getTemperaturaMaxima()).get(0));
		
		evento.setEstado(EnumEstadoEvento.ENPROCESO);
	}

}