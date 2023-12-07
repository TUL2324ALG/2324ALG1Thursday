
package assignments07_2darrays;

import java.util.Scanner;
//Test: 3 3 1 2 -8 3 4 -4 -5 2 8
public class U2NormMatrixProgramAllinMain {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //nacitani od uzivatele
        System.out.println("Zadej rozmery matice");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        double[][] a = new double [m][n];
        System.out.println("Zadej hodnoty matice");
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextDouble();
            }
        }
        //processing
        double maxAbs = -1;//-Double.MAX_VALUE; //nejmensi double
        double absElement;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){ //pruchod 1d pole s hodnotama na i radku
                absElement = Math.abs(a[i][j]);
                if(absElement > maxAbs){
                    maxAbs = absElement;
                }
            }
        }
        //deleni vsech prvku maxAbs
        double[][] b = new double[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
               b[i][j] = a[i][j] / maxAbs;
            }
        }
        
        //vypis uzivateli
        for (int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++){
                System.out.format("%7.2f ",b[i][j]);
            }
            System.out.println("");
        }
    }
    
}
