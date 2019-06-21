package Desarrollo;

public class CommandObtenerSugerencia implements IComand {

	@Override
	public void Execute(Evento evento) {
	
		int temperatura = 0;
		
		Guardarropa guardaropaAsociado = evento.getGuardaropaAsociado();
		evento.setSugerencia(guardaropaAsociado.GenerarSugerencia(temperatura));
	}

}