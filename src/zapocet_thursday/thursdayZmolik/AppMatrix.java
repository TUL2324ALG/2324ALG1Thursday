/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thursdayZmolik;

import java.util.Scanner;

/**
 *
 * @author Zmolik-V-50b5
 */
public class AppMatrix {
    private static int matrixXSize = 0;
    private static int matrixYSize = 0;
    private static boolean run = true;
    
    private static Scanner sc = new Scanner(System.in);
    
    // 3 3 2 7 9 3 4 5 2 0 4
    public static void main(String[] args) {
        while(run){
        Tools tools = new Tools(); //JV Tools by mela byt knihovni trida static metod podobne jako Math, neni potreba delat objekt
        getMatrixSize();
        int[][] matrix = fillMatrix();
        int row = tools.maxRowNotNull(matrix);
        showRow(row,matrix);
        choice();
        }
    }
    
    private static void getMatrixSize(){
        System.out.println("Zadejte počet řádků a sloupců matice ve tvaru: Y X");
        matrixYSize = sc.nextInt();
        matrixXSize = sc.nextInt();
    }
    
    private static int[][] fillMatrix(){
        int[][] matrix = new int[matrixYSize][matrixXSize];
        for(int i = 0; i < matrixYSize; i++){
            System.out.println("Zadejte řádek matice. Čísla oddělte mezerama.");
            System.out.println("Počet čísel na řádku je " + matrixXSize);
            for (int j = 0; j < matrixXSize; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    
    private static void showRow(int rowNum,int[][] matrix){
        System.out.println("Řádek s největším počtem nenulových hodnot je " + rowNum + " a jeho hodnoty jsou:");
        for (int num: matrix[rowNum-1]){
            System.out.println(num); //JV vypise do sloupce
        }
    }
    
    private static void choice(){
        System.out.println("Chceš pokračovat a/n");
        sc.nextLine();
        String choice = sc.nextLine().toUpperCase();
        switch (choice){ //JV trochu zbytecny switch pro jeden case
            case "N":
                run = false;
                break;
        }
    }
}
