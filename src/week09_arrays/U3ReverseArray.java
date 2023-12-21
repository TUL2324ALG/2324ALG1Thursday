package week09_arrays;

import java.util.Scanner;

public class U3ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int[] inNumbers = arrayLoad(sc);
        //procesing
        int[] inNumbersReverse = ArrayTools.reverse(inNumbers);
        //vypis
        System.out.print("Pole:");
        arrayPrint(inNumbers);
        System.out.print("Reverzní pole:");
        arrayPrint(inNumbersReverse);

    }

    //metody UI
    public static void arrayPrint(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length - 1]);
        System.out.println("]");

    }

    public static int[] arrayLoad(Scanner sc) {
        int size;
        System.out.println("Zadej pocet cisel:");
        size = sc.nextInt();
        int[] inNumbers = new int[size];
        for (int i = 0; i < inNumbers.length; i++) {
            System.out.println("Zadej hodnotu do pole:");
            inNumbers[i] = sc.nextInt();

        }
        return inNumbers;
    }
}
