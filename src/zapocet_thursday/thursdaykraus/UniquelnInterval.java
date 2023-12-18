package thursdaykraus;

import java.util.Scanner;

/**
 *
 * @author Kraus-M-1396
 */
public class UniquelnInterval {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //in
        int[] newArray = new int[10];
        boolean konec = true;
        int dolnimez = 0;
        int horniMez = 0;
        int pocetCisel = 0;
         
        
        
        for (int i = 0; i < newArray.length && konec; i++) { //JV co kdyz zada vic jak 10 cisel?

            System.out.println("Zadejte cislo, zapornim cisel interval ukoncite");
            newArray[i] = sc.nextInt();
            if (newArray[i] < 0) {
                konec = false;
            }
        }
        System.out.println("Zadejte interval ve kterym chcete zjistit vyskyt cisel");
        dolnimez = sc.nextInt();
        horniMez = sc.nextInt();
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < horniMez && newArray[i] > dolnimez) {
                pocetCisel++; //JV nevrati pocet jedinecnych cisel
            }
        }
        System.out.print("V posloupnosti [");
        for (int i = 0; i < newArray.length; i++) {
            
           if(i != newArray.length -1){ //JV netestujte porad, jestli je to posledni prvek, dejte mimo for
            System.out.print(newArray[i]+ ","); 
           }
           else
               System.out.print(newArray[i]); 
        }
    
        
        //out
        System.out.print("] v intervalu od " + dolnimez + " a " + horniMez + " : " + pocetCisel + " cisla.");
    }

}
