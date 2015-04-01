package esercizi.slide05;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequenzaTest {

	@Test
	public void testMassimo_SequenzaVuota() {
		new Sequenza().massimo();
	}
	
	@Test
	public void testMassimo_SequenzaSingleton() {
		assertEquals(1, new Sequenza(1).massimo());
	}

	@Test
	public void testMassimo_SequenzaNonVuota_InteriPositivi() {
		assertEquals(8, new Sequenza(1,8).massimo());
	}
	
	@Test
	public void testMassimo_SequenzaNonVuota_InteriNegativi() {
		assertEquals(-1, new Sequenza(-1,-10).massimo());
	}
}
