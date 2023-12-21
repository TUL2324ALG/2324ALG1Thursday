package week13_structuredData;

import java.util.Scanner;

public class U2AreaNShape {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //in
        System.out.println("Zadej pocet vrcholu n uhelnika");
        int n = sc.nextInt();
        System.out.println("Zadej souradnice vrcholu");
        double[][] points = new double[n][2];
        for(int i = 0; i < points.length; i++){
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
//            for(int j = 0; j < points[i].length; j++){
//               points[i][j] = sc.nextDouble();
//            }
        }
        
        double sum = 0;
        for(int i = 0; i < n-1; i++){
           sum = sum + (points[i][0]*points[i+1][1] - points[i+1][0]*points[i][1]);
        }
        sum = sum + (points[n-1][0]*points[0][1] - points[0][0]*points[n-1][1]);
        double area = 0.5 * Math.abs(sum);
        
        System.out.format("Obsah je %.2f %n", area);
        //xi = points[i][0]
        //yi+1 = points[i+1][1]
    }
    
}
