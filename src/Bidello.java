public class Bidello extends Dipendente{
    protected String areaVigilanza;
    protected double contributoRegionale;
    protected double percentualeVigilanza; // va inserito da 0 a 1

    public Bidello (int codice, String cognome,String areaVigilanza, double contributoRegionale, double percentualeVigilanza){
        super(codice, cognome);
        this.areaVigilanza = areaVigilanza;
        this.contributoRegionale = contributoRegionale;
        this.percentualeVigilanza = percentualeVigilanza;
    }

    public String toString(){
        return super.toString();
    }

    public double calcolaStipendio(){ return contributoRegionale * (1 + percentualeVigilanza); }



    @Override
    public boolean minoredi(Comparable x) {
        return false;
    }

    @Override
    public double totale() {
        return 0;
    }
}
