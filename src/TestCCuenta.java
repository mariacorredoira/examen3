import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCCuenta {
	CCuenta miCuenta = new CCuenta();

	@Test
	void TestIngresarMayor3000() {
		assertEquals(0, miCuenta.ingresar(3001));
		}

}


