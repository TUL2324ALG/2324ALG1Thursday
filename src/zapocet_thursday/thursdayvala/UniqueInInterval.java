package thursdayvala;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vala-F-11f8
 */
public class UniqueInInterval {

    /**
     * @param args the command line arguments
     */
    
    //funguje správně (až na zadávání hodnot)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("Zadejte zacatek intervalu");
        int min = sc.nextInt();
        System.out.println("Zadejte konec intervalu");
        int max = sc.nextInt();
        
        
        //toto pak smažu až zjistím jak zadat hodnoty a ukončit zadavani zadanou zápornou hodnotou
        System.out.println("Zadejte pocet hodnot v sade");
        int a = sc.nextInt();
        
        int [] interval = new int [a];
        for (int i=0; i<interval.length; i++){
            System.out.println("Zadejte hodnotu"); //JV toto muzete dat i nad for jednou pro vsechny hodnoty "Zadejte hodnoty"
            interval[i] = sc.nextInt();
        }
        count = getDigitCount(interval, min, max);
        System.out.println("V posloupnosti " + Arrays.toString(interval) + " v intervalu " + min + " az " + max + ": " + count + " cisla.");
        
    }
    public static int getDigitCount (int [] a, int min, int max){
        int count=0;
        for (int i=0; i<a.length; i++){
                if (a[i]>=min && a[i]<=max){
                    count++; //JV mela to byt jedinecna cisla
                }
        }
        return count;
    }
    
}
