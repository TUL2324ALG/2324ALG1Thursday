/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * TEST [4 6 3 5 5 3 2 7 5 4]
 * interval od 4 do 9
 *
 */

package thursdaystastny;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Stastny1-J-df6f
 */
public class UniqueInInterval {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uniq=0;
        int temp=0;
        System.out.println("Zadejte velikost posloupnosti: "); //JV uzivatel nezada delku posloupnosti, jen jeji zadavani ukonci zapornym cislem
        int[] sequence=new int[sc.nextInt()];
        System.out.println("Zadejte hodnoty posloupnosti (zápornou hodnotou ukončete zadávání hodnot): ");
        for (int i = 0; i < sequence.length; i++) {
            if (sc.nextInt()<0) {
            break;
            }
            sequence[i]=sc.nextInt();            
        }
        System.out.println("Zadejte začátek intervalu: ");
        int minInterval=sc.nextInt();
        System.out.println("Zadejte konec intervalu: ");
        int maxInterval=sc.nextInt();
        for (int i = minInterval; i < maxInterval+1; i++) {
            if (sequence[i]!=temp) { //JV bylo trochu jinak myslene zadani
                uniq++;
                temp=sequence[i];
            }
        }
        System.out.println("V posloupnosti" +Arrays.toString(sequence) + " v intervalu "+ minInterval +" až "+ maxInterval + ": "+ uniq + " čísla.");
    } 
}
