package week04_branching;

public class U15RodneCislo {

    public static void main(String[] args) {
    //vstup
        int prvnicislo = 780123;
        int druhecislo = 3540;
    //vypocet
        //vytvoření prvních 9 cifer
        int devetCifer = prvnicislo * 1000 + druhecislo / 10; //780123000 + 354
        //ziskat posledni cifry 
        int poslednicislo = druhecislo % 10; //0
        //vyhodnoceni
        boolean vysledek;
        //prohozeni podminek vuci zadani z duvodu optimalizace
        vysledek = (devetCifer % 11 == poslednicislo || (poslednicislo == 0 && devetCifer % 11 == 10));
         
        System.out.println(vysledek);
    }

}
