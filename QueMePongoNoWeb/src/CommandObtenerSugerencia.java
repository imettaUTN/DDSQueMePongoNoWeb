
public class CommandObtenerSugerencia implements IComand {

	@Override
	public void Execute(Evento evento) {
	Guardarropa guardaropaAsociado = evento.getGuardaropaAsociado();
		
    evento.setSugerencia(guardaropaAsociado.GenerarSugerencia());
	}

}