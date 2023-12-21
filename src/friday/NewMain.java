/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package friday;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Doplňte kód metody, která prohodí hodnoty v zadané matici podle horizontální osy.
        //void reverseHorizontally(int[][] a) {}
        int[] b= {-2,-3,-3,-9,-6};
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        reverseHorizomtally(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("Is it negative and dividet by three? Ans: " + onlyNegativeDivisibleByTree(b));
        //int[] temp = new int[0];

    }

    public static void reverseHorizomtally(int[][] a) {
        int[] temp;
        for (int i = 0; i < (a.length / 2); i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;

        }

    }

    public static void reverseHorizomtally1(int[][] a) {
        int temp;
        for (int i = 0; i < (a.length / 2); i++) {
            for (int j = 0; j < a[i].length; j++) {
                temp = a[i][j];
                a[i][j] = a[a.length - 1 - i][j];
                a[a.length - 1 - i][j] = temp;
            }
        }

    }

    public static boolean onlyNegativeDivisibleByTree(int[] b) {
        boolean isNegAndTree = true;
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 0 || b[i] % 3 != 0) {
            isNegAndTree = false;
            return isNegAndTree;
            }
        }
        
        return isNegAndTree;
     }
}
