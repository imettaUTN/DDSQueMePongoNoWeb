import java.util.*;
import java.time.*;


public class ProxyApiClima {

	int temperaturas [][]= new int [4][2];
	
// constructor	
public  ProxyApiClima() {
/* Es un contructor para setear las temperatura maxima y minima para una determinada estacion
 * Posicion 0 del vector corresponde a verano
 * Posicion 1 del vector corresponde a otoño
 * Posicion 2 del vector corresponde a invierno
 * Posicion 3 del vector corresponde a primavera
 */
	// verano temp minima y maxima
		temperaturas [0][0]= 20; 
		temperaturas [0][1]= 36;
		
		// otoño temp minima y maxima
		temperaturas [1][0]= 18;
		temperaturas [1][1]= 22;
		
		// invierno temp minima y maxima
		temperaturas [2][0]= -10; 
		temperaturas [2][1]= 15;
		
		// primavera temp minima y maxima
		temperaturas [3][0]= 22;
		temperaturas [3][1]= 30;

}	
	
public int GetTemperatura(LocalDate fecha, int longitud, int latitud, String ciudad, String pais, String provincia) {
/*Este metodo devuelve un temperatura  dentro de un rango de fecha. Se parte de la premisa que 
la ubicacion geofrafica corresponde corresponde a la provincia de buenos aires 
*/
	return this.getTemperaturaParaEstacion(this.getEstacionDelAño(fecha)) ;
}	

public int getEstacionDelAño(LocalDate fecha) {	
/* En funcion de la fecha recibida, se determina a que estacion del año corresponde
	Verano (21 de diciembre a 20 de marzo).
	Otoño (21 de marzo a 20 de junio).
	Invierno (21 de junio a 20 de septiembre).
	Primavera (21 de septiembre a 20 de diciembre).
*/
    
    // corresponde a una fecha de verano
	if  (fecha.isAfter(LocalDate.of(fecha.getYear() -1 , 12, 20)) &&
		 fecha.isBefore(LocalDate.of(fecha.getYear() , 03, 21))) 
	    {	
	     return 0 ;
	    }
	// corresponde a una fecha de otoño
	if  (fecha.isAfter(LocalDate.of(fecha.getYear(),3, 20)) &&
		 fecha.isBefore(LocalDate.of(fecha.getYear(),6, 21))) 
		    {	
		     return 1 ;
		    }	

	// corresponde a una fecha de invierno
	if  (fecha.isAfter(LocalDate.of(fecha.getYear(), 6, 21)) &&
			fecha.isBefore(LocalDate.of(fecha.getYear(),9, 21))) 
		    {	
		     return 2 ;
		    }	
		
// corresponde a una fecha de primavera	
	return 3;
}

public int getTemperaturaParaEstacion(int unaEstacion) {
/* En funcion de la estacion del año que se recibe como parametro se determina una temperatura de 
 * manera random entre las temperatura maxima y minima para dicha estacion 
 */
	Random numeroAleatorio= new Random();
	
	return temperaturas[unaEstacion][0] + numeroAleatorio.nextInt(temperaturas[unaEstacion][1] - temperaturas[unaEstacion][0] ); 
}

}

