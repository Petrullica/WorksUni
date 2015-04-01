package esercizi.slide07;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CerchioTest {
	private Punto origine;
	private Cerchio unitario;

	@Before
	public void setUp() {
		origine = new Punto(0,0);
		unitario = new Cerchio(origine,1);		
	}

	@Test
	public void testTrasla() {
		unitario.trasla(0, 0);
		assertEquals("eppur si muove", origine, unitario.getCentro());
	}

	@Test
	public void testTraslaOrizzontalmente() {
		unitario.trasla(1, 0);
		assertEquals(new Punto(1,0), unitario.getCentro());
	}
}
