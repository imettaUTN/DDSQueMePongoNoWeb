package Testing;
import org.junit.*;
import Desarrollo.*;

public class TestDeUsuario {
	
	private Usuario usuario = new Usuario();
	private EnumUsuario Premium;
	private Guardarropa guardarropaUno = new Guardarropa();
	private Guardarropa guardarropaDos = new Guardarropa();
	private Guardarropa guardarropaTres = new Guardarropa();
	
	@Before
	public void init(){
		
		usuario.setNombre("Cristian");
		usuario.setApellido("Romero");
		usuario.setPassword("Cris2019");
		usuario.setTipoUsuario(Premium);
		
		usuario.agregarGuardarropa(guardarropaUno);
		usuario.agregarGuardarropa(guardarropaDos);
		usuario.agregarGuardarropa(guardarropaTres);
		
	}
	
	@Test
	public void cantidadDeGuardarropas(){
		
		Assert.assertEquals(3, usuario.cantidadDeGuardarropas());
		
	}
}
