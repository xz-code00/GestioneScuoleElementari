public class Albero {

    private Nodo root;

    public Albero () {
        root = null;
    }

    public void addInfo (Comparable key) {
        root = addInfo(root, key);
    }

    private Nodo addInfo(Nodo p, Comparable key){
        if (p == null){
            return new Nodo(key);
        }
        if (key.getValore() <= p.getKey().getValore())
            p.setLeft(addInfo(p.getLeft(), key));
        else if(key.getValore() > p.getKey().getValore())
            p.setRight(addInfo(p.getRight(), key));
        return p;
    }


    //Stampa le chiavi
    private String toString (Nodo p) {
        if(p == null)
            return "";
        return toString(p.getLeft()) + p.getKey() + " | "  + toString(p.getRight());
    }

    public String toString() {
        return toString(root);
    }


    //Cerca una chiave
    private boolean cercaChiave(Nodo p, int valore){
        if(p == null)
            return false;
        if(p.getKey().getValore() == valore)
            return true;

        if (valore < p.getKey().getValore())
            return cercaChiave(p.getLeft(), valore);
        else
            return cercaChiave(p.getRight(), valore);

    }

    public boolean cercaChiave(int valore){
        return cercaChiave(root, valore);
    }
    public double totaleStipendio(){
        return totaleStipendio(root);
    }
    private double totaleStipendio(Nodo p){
        if(p == null) return 0;
        return p.getKey().getValore() + totaleStipendio(p.getLeft()) + totaleStipendio(p.getRight());
    }
}