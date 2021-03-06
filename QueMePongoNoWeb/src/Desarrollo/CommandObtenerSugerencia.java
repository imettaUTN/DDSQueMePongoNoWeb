package Desarrollo;

import java.io.IOException;
import java.util.*;

import Desarrollo.Enumerados.EnumEstadoEvento;

public class CommandObtenerSugerencia implements IComand {

	@Override
	public void Execute(Evento evento) throws IOException  {
		
		/*
		Guardarropa guardaropaAsociado = evento.getGuardaropaAsociado();
		evento.setSugerencias(guardaropaAsociado.GenerarSugerencia(evento.getTemperaturaMinima(), evento.getTemperaturaMaxima()));
		*/
	
		List<Guardarropa> guardarropas = evento.getUsuario().getGuardarropas(); 
		
		for(Guardarropa guardarropa: guardarropas){
			
			evento.setSugerencias(guardarropa.GenerarSugerencia(evento.getTemperaturaMinima(), evento.getTemperaturaMaxima()));
			
		}
		
		
		evento.setEstado(EnumEstadoEvento.ENPROCESO);
	}

}