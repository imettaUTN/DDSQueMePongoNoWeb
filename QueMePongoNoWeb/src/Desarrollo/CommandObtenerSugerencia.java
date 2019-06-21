package Desarrollo;

public class CommandObtenerSugerencia implements IComand {

	@Override
	public void Execute(Evento evento) {
	
		int temperatura = 0;
		EnumEstadoEvento ENPROCESO = null;
		
		Guardarropa guardaropaAsociado = evento.getGuardaropaAsociado();
		evento.setSugerencia(guardaropaAsociado.GenerarSugerencia(temperatura));
		
		evento.setTemperatura(temperatura);
		evento.setEstado(ENPROCESO);
	}

}