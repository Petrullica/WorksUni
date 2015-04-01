package esercizi.slide07;

public class GruppoDiForme implements Forma {

	private static final int MAX_NUMERO_FORME = 10;
	private Forma forme[];
	private int numeroForme;
	public GruppoDiForme() {
		this.numeroForme = 0;
		this.forme = new Forma [MAX_NUMERO_FORME];
	}

	public boolean aggiungiForma(Forma nuovaArrivata) {
		if (this.numeroForme < MAX_NUMERO_FORME) {
			this.forme[this.numeroForme] = nuovaArrivata;
			this.numeroForme++;
			return true;
		}
		return false;
	}

	@Override
	public void trasla(int deltaX, int deltaY) {
		for (int i=0; i<this.numeroForme; i++) {
			this.forme[i].trasla(deltaX, deltaY);
		}

	}

}
