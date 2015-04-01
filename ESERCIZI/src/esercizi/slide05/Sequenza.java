package esercizi.slide05;

public class Sequenza {
	private int[] sequenza;
	
	public Sequenza(int... array) {
		this.sequenza = new int[50];
		for(int i=0; i<array.length; i++) {
			int prova = array[i];
			sequenza.setElemento(i,prova); }
	}
	
	public int massimo() {
		if (this.sequenza.length==0)
			throw new java.util.NoSuchElementException();
		int max = getElemento(0);
		for (int i=1; i<sequenza.length; i++)
			if (getElemento(i)>max)
				max = getElemento(i);
		return max;
	}
	public int getElemento(int indice) {
		return sequenza[indice];
	}
	public void setElemento(int indice,int valore) {
		sequenza[indice] = valore;
	}

	public static void main(String[] args) {
		Sequenza positivi, negativi, negEpos, negEzero, inPrimaPos, inUltimaPos;
		
		positivi = new Sequenza(1,3,8,5,6);
		
		negativi = new Sequenza(5);
		negativi.setElemento(0,-6);
		negativi.setElemento(1,-1); // MAX!
		negativi.setElemento(2,-8);
		negativi.setElemento(3,-13);
		negativi.setElemento(4,-10);
		
		negEpos = new Sequenza(5);
		negEpos.setElemento(0,100);
		negEpos.setElemento(1,-5);
		negEpos.setElemento(2,-80);
		negEpos.setElemento(3,1000); // MAX!
		negEpos.setElemento(4,10);
		
		negEzero = new Sequenza(5);
		negEzero.setElemento(0,-1);
		negEzero.setElemento(1,0); // MAX!
		negEzero.setElemento(2,-80);
		negEzero.setElemento(3,-10);
		negEzero.setElemento(4,-10);
		
		inPrimaPos = new Sequenza(5);
		inPrimaPos.setElemento(0, 1000); // MAX!
		inPrimaPos.setElemento(1, 0);
		inPrimaPos.setElemento(2, 80);
		inPrimaPos.setElemento(3,-10);
		inPrimaPos.setElemento(4,-10);
		
		inUltimaPos = new Sequenza(5);
		inUltimaPos.setElemento(0, 1);
		inUltimaPos.setElemento(1, 0);
		inUltimaPos.setElemento(2, 80);
		inUltimaPos.setElemento(3,-10);
		inUltimaPos.setElemento(4, 1000); // MAX!
		
		boolean esito = true;
		System.out.println("----TEST----");
		esito &= (positivi.massimo() == 8);
		System.out.println(positivi.massimo() == 8);
		esito &= (negativi.massimo() == -1);
		System.out.println(negativi.massimo() == -1);
		esito &= (negEpos.massimo() == 1000);
		System.out.println(negEpos.massimo() == 1000);
		esito &= (negEzero.massimo() == 0);
		System.out.println(negEzero.massimo() == 0);
		esito &= (inPrimaPos.massimo() == 1000);
		System.out.println(inPrimaPos.massimo() == 1000);
		esito &= (inUltimaPos.massimo() == 1000);
		System.out.println(inUltimaPos.massimo() == 1000);
		
		System.out.println(esito);
		}

}
