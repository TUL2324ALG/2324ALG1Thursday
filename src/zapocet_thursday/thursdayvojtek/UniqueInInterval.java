/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thursdayvojtek;

import java.util.Scanner;

/**
 *
 * @author Vojtek-M-a1c7
 */
public class UniqueInInterval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte začátek intervalu a konec intervalu");
        int zacatekin =sc.nextInt();
        int konecin = sc.nextInt();
        int[] interval = new int[(konecin-zacatekin)+1];
        for (int i = 0; i < interval.length; i++) 
        {
            interval[i]=zacatekin+i;
        }
        int[] posloupnost = new int[1];
        System.out.println("Začněte zadávat posloupnost a ukončete záporným číslem.");
        int cislo = sc.nextInt();
        while (cislo>=0)        
        {        
          
            int[] pomoc = new int[posloupnost.length+1];
            for (int i = 0; i < posloupnost.length; i++) 
            {
                
                pomoc[i]=posloupnost[i];
            }
            pomoc[pomoc.length-1] = cislo;
            posloupnost = new int[pomoc.length];
            for (int i = 0; i < posloupnost.length; i++) 
            {
                
                posloupnost[i]=pomoc[i];
            }
            cislo = sc.nextInt();           
        }
        int uniq=0;
        for (int i = 0; i < interval.length; i++) 
        {
            int vyskyt =0;
            for (int j = 0; j < posloupnost.length; j++) 
            {
                if(posloupnost[j]==interval[i])
                {
                    vyskyt++;
                }
            }
            if(vyskyt==1)  
            {
                uniq++;
            }
        }
        System.out.print("V posloupnosti [");
        for (int i = 0; i < posloupnost.length; i++) 
        {
            System.out.print(" "+ posloupnost[i]);
        }
        System.out.print(" ]  v intervalu " + zacatekin + " až " +konecin+" je " +uniq+ " unikátních čísel");
        
    }
    
}
