/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thursdayvalenta;

import java.util.Scanner;

/**
 *
 * @author Valenta-L-5c7a
 */
public class AppMatrix {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;
        do {
            //INPUT
            System.out.println("Zadejte vysku a sirku:");
            int height = sc.nextInt();
            int width = sc.nextInt();

            System.out.println("Zadejte hodnoty matice:");
            int[][] matrix = new int[height][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            //
            int ind = Tools.maxRowNotNull(matrix);

            //OUTPUT
            System.out.println("Radek s nejvetsim poctem nenulovych hodnot:");

            System.out.print("Index " + ind + ": [" + matrix[ind][0]);
            for (int j = 1; j < width; j++) {
                int num = matrix[ind][j];
                System.out.print("," + num);
            }
            System.out.print("]");
            System.out.println();

            System.out.println("Pokracovat? Y/N");
            choice = sc.next().charAt(0);
        } while (choice != 'q' && choice != 'n' && choice != 'N');
    }
}
