package Testing;

import java.io.*;
import java.util.*;
import com.google.gson.*;
import Desarrollo.*;

public class TestLeerArchivoJson {
	public static String readFile(String file) throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader (file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    try {
	        while((line = reader.readLine()) != null) {
	            stringBuilder.append(line);
	            stringBuilder.append(ls);
	        }

	        return stringBuilder.toString();
	    } finally {
	        reader.close();
	    }
	}
	
	
	public static List<Prenda> JsonToPrendas(String path) throws IOException {
		
		String json1 = readFile(path);
		JsonParser parser = new JsonParser();
		List<Prenda> prendas = new ArrayList<Prenda>();
		// Obtengo el primer ObjetoJason
	   	JsonArray gsonObj1 = parser.parse(json1).getAsJsonArray();

	   	for (JsonElement obj : gsonObj1) {
	   		
	        // Obtengo el objeto Cliente
	        JsonObject gsonObj = obj.getAsJsonObject();
	
	        // Obtengo las primitivas del cliente
	        Prenda prenda = new Prenda();
	        prenda.setColorPrimario(gsonObj.get("colorPrimario").getAsString());
	        prenda.setColorSecundario(gsonObj.get("colorSecundario").getAsString());
	        prenda.setColorPrimario(gsonObj.get("colorPrimario").getAsString());

            JsonArray telasValidas = gsonObj.get("telasValidas").getAsJsonArray();
            TipoPrenda tp = new TipoPrenda();
            for (JsonElement tl : telasValidas) {
            	tp.AddTelaValida(gsonObj.getAsString());            	
            }
            tp.setNivelAbrigo(gsonObj.get("nivelAbrigo").getAsInt());
            tp.setDescripcion(gsonObj.get("descripcion").getAsString());
            prenda.setTipoPrenda(tp);
            prenda.setTela(gsonObj.get("tela").getAsString());
            prenda.setCategoria(GetTipoCategoria(gsonObj.get("categoria").getAsString()));
            prenda.setNumeroCapa(gsonObj.get("numeroCapa").getAsInt());
            prenda.setUrlImagen((gsonObj.get("urlImagen").getAsString()));
            prendas.add(prenda);
	   	}        
return prendas;
	}
	
public static List<Parametros> JsonToParametros(String path) throws IOException {
		
		String json1 = readFile(path);
		JsonParser parser = new JsonParser();
		List<Parametros> parametros = new ArrayList<Parametros>();
		// Obtengo el primer ObjetoJason
	   	JsonArray gsonObj1 = parser.parse(json1).getAsJsonArray();

	   	for (JsonElement obj : gsonObj1) {
	   		
	        // Obtengo el objeto Cliente
	        JsonObject gsonObj = obj.getAsJsonObject();
	
	        // Obtengo las primitivas del cliente
	        Parametros parametro = new Parametros();
	        parametro.setNivelAbrigoDeseado(gsonObj.get("NivelAbrigoDeseado").getAsInt());
	        parametro.setRangoTemperaturaHasta(gsonObj.get("rdtd").getAsInt());
	        parametro.setRangoTemperaturaDesde(gsonObj.get("rdtH").getAsInt());
	        parametro.setCategoria(GetTipoCategoria(gsonObj.get("categoria").getAsString()));
	        parametros.add(parametro);
	   	}     
return parametros;
	}
	
	private static EnumCategoria GetTipoCategoria(String xCategoria){
		
		switch(xCategoria) {
		case "Superior":
		return EnumCategoria.Superior;
		case "Inferior":
		return EnumCategoria.Inferior;
		case "Calzado":
			return EnumCategoria.Calzado;
		case "Accesorio":
			return EnumCategoria.Accesorio;
			default :
			return null;
		}
		
	}
}
