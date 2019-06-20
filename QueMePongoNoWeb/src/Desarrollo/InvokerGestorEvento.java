package Desarrollo;

public class InvokerGestorEvento {
private IComand comand;

public IComand getComand() {
	return comand;
}

public void setComand(IComand comand) {
	this.comand = comand;
}

public void ObtenerSugerencia(Evento evento) {
	CommandObtenerClima clima = new CommandObtenerClima();
	clima.Execute(evento);
	CommandObtenerSugerencia sugerencia = new CommandObtenerSugerencia();
	sugerencia.Execute(evento);
}

}
