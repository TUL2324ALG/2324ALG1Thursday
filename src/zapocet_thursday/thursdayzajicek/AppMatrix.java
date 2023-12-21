package thursdayzajicek;

import java.util.Scanner;

public class AppMatrix {
    private static final Scanner sc = new Scanner(System.in);
    
    //JV A
    public static void main(String[] args) {
        int r = 0;
        int s = 0;
        
        while (true) {
            r = sc.nextInt();
            s = sc.nextInt();
            
            if (r == 0 || s == 0) {
                System.out.println("Program ukoncen. ");
                break;
            }

            int[][] a = new int[r][s];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            int index = Tools.maxRowNotNull(a);       
            System.out.println("Cislo radku: " + index);

            System.out.println("Výpis hodnot z radku: ");
            for (int j = 0; j < a[index-1].length; j++) {
                System.out.print(a[index-1][j] + " ");
            }
        }
        
    }
}
