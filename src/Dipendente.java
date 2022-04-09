
abstract class Dipendente implements Comparable {

    protected int codice;
    protected String cognome;

    public Dipendente(int codice, String cognome){
        this.codice = codice;
        this.cognome = cognome;
    }

    public int getCodice (){
        return codice;
    }

    public String toString(){
        return codice + " " + cognome + " " + calcolaStipendio();
    }

    abstract public double calcolaStipendio();

    abstract public boolean minoredi(Comparable x);
    abstract public double totale();

    public double getValore (){
        return codice;
    }
}
