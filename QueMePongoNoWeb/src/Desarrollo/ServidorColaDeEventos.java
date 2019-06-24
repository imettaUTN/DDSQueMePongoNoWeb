package Desarrollo;

import java.io.IOException;
import java.util.*;
public class ServidorColaDeEventos {

		private List<Evento> colaEventosNuevos;
		private List<Evento> colaEventosActivos;
		private Evento cabeceraColaEventosNuevos;
		private Evento cabeceraColaEventosActivos;
		private InvokerGestorEvento invoker;
		
		public ServidorColaDeEventos() {
			this.colaEventosNuevos= new ArrayList<Evento>();
			this.colaEventosActivos= new ArrayList<Evento>();
		}
		
		
		public List<Evento> getColaEventosNuevos() {
			return colaEventosNuevos;
		}
		
		public void setColaEventosNuevos(List<Evento> colaEventosNuevos) {
			this.colaEventosNuevos = colaEventosNuevos;
		}
		
		public List<Evento> getColaEventosActivos() {
			return colaEventosActivos;
		}
		
		public void setColaEventosActivos(List<Evento> colaEventosActivos) {
			this.colaEventosActivos = colaEventosActivos;
		}
		
		public void EncolarEvento(Evento evento, List<Evento> cola) {
			cola.add(evento);
		}
		
		
		public void DesEncolarEvento(Evento evento, List<Evento> cola) {
			cola.remove(evento);
		}
		
		
		public void EncolarNuevoEvento(Evento evento) {
			EncolarEvento(evento, this.getColaEventosNuevos());
			
		}
		public List<Sugerencia> ProcesarEventoEnCola() throws IOException {
			//aca va la magia de procesamiento de la cola
			// ver de usar algun framwwork que haga esto
			Evento eventoProcesado = this.getCabeceraColaEventosNuevos();
			DesEncolarEvento(eventoProcesado, this.getColaEventosNuevos());
			invoker.ProcesarEvento(eventoProcesado);
			EncolarEvento(eventoProcesado, this.colaEventosActivos);
			return eventoProcesado.getSugerencias();
		}
		
		
		public Evento getCabeceraColaEventosNuevos() {
			return cabeceraColaEventosNuevos;
		}
		
		public void setCabeceraColaEventosNuevos(Evento cabeceraColaEventosNuevos) {
			this.cabeceraColaEventosNuevos = cabeceraColaEventosNuevos;
		}
		
		public Evento getCabeceraColaEventosActivos() {
			return cabeceraColaEventosActivos;
		}
		
		public void setCabeceraColaEventosActivos(Evento cabeceraColaEventosActivos) {
			this.cabeceraColaEventosActivos = cabeceraColaEventosActivos;
		}
		
		public InvokerGestorEvento getInvoker() {
			return invoker;
		}
		
		public void setInvoker(InvokerGestorEvento invoker) {
			this.invoker = invoker;
		}
}
