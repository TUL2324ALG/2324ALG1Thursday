
package assignments07_2darrays;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej rozmery matice");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] a = new int [m][n];
        System.out.println("Zadej hodnoty matice");
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Hello");
    }
    
}
