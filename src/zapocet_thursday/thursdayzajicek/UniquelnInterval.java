package thursdayzajicek;

import java.util.Scanner;

public class UniquelnInterval {
   
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a[] = new int[10];   //JV, co kdyz uzivatel zada vic nez 10 cisel? 
        int n = 0;
        int i = 0;
        int pocet = 0;
        
        while (true) {
            n = sc.nextInt();         
            if (n < 0) {
                break;
            }
            a[i] = n;              
            i++;      
        }
        pocet = i;
        int f = sc.nextInt();
        int l = sc.nextInt();
        
        for (int j = f; j < l/2; j++) { //JV zadani bylo mysleno trochu jinak
            for (int k = j; k < l; k++) {
                if (a[j] == a[k+1]) {
                    pocet--;
                }
            }
        }
   
        for (int j = 0; j < i-1; j++) {
            System.out.print(a[j] + ", ");
        }
        System.out.print(a[i]);
        System.out.println("v intervalu " + f + "az" + l + ": " + pocet);       
    }
}
