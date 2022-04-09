public class Scuola  {

    private String nome;
    private double importoMax;
    private Albero dipendenti;

    public Scuola(String nome, double importoMax){
        this.nome = nome;
        this.importoMax = importoMax;
        dipendenti = new Albero();
    }

    public void inserisciDipendendente(Comparable x){
        dipendenti.addInfo(x);
    }

    public String toString(){
        return nome + " | " + importoMax + "\n" + dipendenti;
    }

    public boolean cercaDipendente (int codice){
        return dipendenti.cercaChiave(codice);
    }

    public double totaleStipendi () {
        return dipendenti.totaleStipendio();
    }
}
