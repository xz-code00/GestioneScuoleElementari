public class Nodo{

    private Comparable key;
    private Nodo right;
    private Nodo left;



    public Nodo (Comparable key) {
        this.key = key;
        right = null;
        left = null;
    }

    public void setKey (Comparable key) {
        this.key = key;
    }

    public void setLeft (Nodo left) {
        this.left = left;
    }

    public void setRight (Nodo right) {
        this.right = right;
    }

    public Comparable getKey () {
        return key;
    }

    public Nodo getLeft () {
        return left;
    }

    public Nodo getRight () {
        return right;
    }

}