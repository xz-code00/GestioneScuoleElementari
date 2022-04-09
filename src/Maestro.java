public class Maestro extends Dipendente{

    protected String laurea;
    protected double stipendioBase;
    protected double importoGuadagnatoCorsi;

    public Maestro (int codice, String cognome,String laurea, double stipendioBase, double importoGuadagnatoCorsi){
        super(codice, cognome);
        this.laurea = laurea;
        this.stipendioBase = stipendioBase;
        this.importoGuadagnatoCorsi = importoGuadagnatoCorsi;
    }

    public String toString(){
        return super.toString();
    }

    public double calcolaStipendio(){
        return stipendioBase + importoGuadagnatoCorsi;
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
