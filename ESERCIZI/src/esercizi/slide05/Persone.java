package esercizi.slide05;

public class Persone {
    private String[] nomi;
    
    public Persone(int n) {
        this.nomi = new String[n];
    }
    
    public int contaOmonimiDi(String nome) {
        // deve restituire il numero di nomi dell'array che 
        // sono uguali al nome passato come parametro
    	int count = 0;
    	for(int i=0; i<nomi.length; i++) {
    		if(nomi[i]==nome)
    			count++;
    	}
    	return count;
    }
    
    public void setNome(int indice, String nome){
        this.nomi[indice] = nome;
    }
    
    public static void main(String[] args) {
    	Persone a = new Persone(5);
    	a.setNome(0, "Giacomo");
    	a.setNome(1, "Giacomo");
    	a.setNome(2, "Simone");
    	a.setNome(3, "Giacomo");
    	a.setNome(4, "Giacomo");
    	System.out.println("---TEST---");
    	System.out.println(a.contaOmonimiDi("Riccardo"));
    }
}