
public class CommandObtenerSugerencia implements IComand {

	@Override
	public void Execute(Evento evento) {
	Guardaropa guardaropaAsociado = evento.getGuardaropaAsociado();
		
    evento.setSugerencia(guardaropaAsociado.GenerarSugerencia());
	}

}