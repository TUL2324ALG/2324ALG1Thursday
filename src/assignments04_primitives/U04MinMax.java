package assignments04_primitives;

import java.util.Scanner;

public class U04MinMax {

    /*
     Napište program, kterému je na vstupu zadána posloupnost celých kladných čísel. Program má vypsat minimální 
        a maximální zadanou hodnotu a počet sudých členů posloupnosti. Program modifikujte pro oba způsoby 
        zadávání posloupnosti.
    */
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // se zadanim poctem prvku
        System.out.println("Zadejte počet cisel:");
        int pocetPrvku = sc.nextInt();
        int cislo = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pocetSud = 0;
        
        System.out.println("Zapište zadany pocet čísel");
        
        for(int i = 0; i < pocetPrvku; i++) {
            cislo = sc.nextInt();
            if (cislo < min) min = cislo;
            if (cislo > max) max = cislo;
            if (cislo % 2 == 0) pocetSud++;
        }
        
        if(pocetPrvku == 0){ //osetreni limitniho stavu
            System.out.println("Byla zadana prazdna posloupnost");
        } else {
            System.out.println("Minimum je: " + min);
            System.out.println("Maximum je: " + max);
            System.out.println("Počet sudých čísel je: " + pocetSud);
        }
    }   
}