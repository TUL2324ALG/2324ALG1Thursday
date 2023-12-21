
package week07_sequence;

import java.util.Scanner;

public class Z4U7RaisingSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Zadejte pocet prvku posloupnosti : ");
        int n = sc.nextInt();
        double number;
        double predchoziCislo;
        boolean rising = true;
        
        System.out.println("Zadej zadany pocet cisel");
        predchoziCislo = sc.nextDouble(); //prvni cislo nactu samostatne
       
        for (int i = 1; i < n; i++) {
            
            number = sc.nextDouble(); //nacitam ostatni a porovnavam s predchozim
         
            if (predchoziCislo >= number){ //rising je porad true, pokud najdu zmenim jednou mna false a ukoncim cyklus
                rising = false ;    
                break;
            } 
            predchoziCislo = number; //z nacteneho cisla se stane predchozi
        }
        
        if (rising) {  //check jestli je rising true 
            System.out.println("Je to stoupajici posloupnost");
        } else {
              System.out.println("Neni to stoupajici posloupnost");
        }
        
    }

}
