package esercizi.slide05;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersoneTest {
	private Persone persone(String... array) {
		Persone risultato = new Persone(array.length);
		for (int i=0; i<array.length; i++)
			risultato.setNome(i,array[i]);
		return risultato;
	}

	@Test
	public void testZeroOmonimi_Singleton() {
		assertEquals(0, persone("Francesco").contaOmonimiDi("Riccardo"));
	}
	
	@Test
	public void testUnoOmonimo_Singleton() {
		assertEquals(1, persone("Riccardo").contaOmonimiDi("Riccardo"));
	}
	
	@Test
	public void testDueOmonimi() {
		assertEquals(2, persone("Riccardo", "Andrea", "Riccardo", "Roberto").contaOmonimiDi("Riccardo"));
	}
	
	@Test
	public void testTuttiOmonimi() {
		assertEquals(3, persone("Riccardo", "Riccardo", "Riccardo").contaOmonimiDi("Riccardo"));
	}

}
