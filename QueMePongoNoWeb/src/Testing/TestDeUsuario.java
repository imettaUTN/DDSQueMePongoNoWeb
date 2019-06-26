package Testing;
import org.junit.*;
import Desarrollo.*;
import Desarrollo.Enumerados.EnumUsuario;

public class TestDeUsuario {
	
	private Usuario usuario = new Usuario();
	private EnumUsuario Premium;
	private Guardarropa guardarropaUno = new Guardarropa();
	private Guardarropa guardarropaDos = new Guardarropa();
	private Guardarropa guardarropaTres = new Guardarropa();
	
	@Before
	public void init(){
		
		
		
	}
	
	@Test
	public void cantidadDeGuardarropas(){
		
		Assert.assertEquals(3, usuario.cantidadDeGuardarropas());
		
	}
}
