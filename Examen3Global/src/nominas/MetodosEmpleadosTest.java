package nominas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MetodosEmpleadosTest {

	@Test
	public final void testSeguroVida() {
		Empleados emple = new Empleados ("Manu", "Garcia", 1, 1, 2020, .5, false, null);
		boolean resultado = emple.getRiesgo();
		boolean esperado = false;
		assertEquals(esperado, resultado);
		
	}

}
