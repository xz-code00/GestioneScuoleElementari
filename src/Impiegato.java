public class Impiegato extends Dipendente{

    protected double oreLavoro;
    protected double importoOrario;

    public Impiegato(int codice, String cognome, double oreLavoro, double importoOrario){
        super(codice, cognome);
        this.oreLavoro = oreLavoro;
        this.importoOrario = importoOrario;
    }

    public String toString(){
        return super.toString();
    }

    public double calcolaStipendio(){
        return oreLavoro * importoOrario;
    }

    @Override
    public boolean minoredi(Comparable x) {
        return false;
    }

    @Override
    public double totale() {
        return 0;
    }
}