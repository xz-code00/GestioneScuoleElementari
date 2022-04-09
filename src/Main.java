public class Main {

    public static void main (String[] args){
        Scuola s1 = new Scuola("ITTS GIRO", 340);
        Maestro cicogna = new Maestro(111, "Cicogna", "nulla", 120,0);
        Maestro deLuca = new Maestro(45, "De Luca", "nulla", 120,0);
        Maestro deCeglia = new Maestro(300, "De Ceglia", "nulla", 120,0);


        s1.inserisciDipendendente(cicogna);
        s1.inserisciDipendendente(deLuca);
        s1.inserisciDipendendente(deCeglia);

        System.out.println(s1);

        System.out.println(s1.cercaDipendente(111));
        System.out.println(s1.cercaDipendente(666));
        System.out.println(s1.totaleStipendi());
    }
}
