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
public class UniqueInInterval {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadejte interval: <a,b>");
        int lower = sc.nextInt();
        int higher = sc.nextInt();

        if (higher < lower) { // Swap
            int temp = lower;
            lower = higher;
            higher = temp;
        }

        int[] arr = new int[10];
        int valueCount = 0;
        {
            System.out.println("Zadavejte hodnoty, ukoncete zapornym cislem:");
            int a;
            while ((a = sc.nextInt()) >= 0) {
                if (arr.length - 1 == valueCount) { //resize
                    int[] temp = new int[2 * arr.length];
                    System.arraycopy(arr, 0, temp, 0, arr.length);
                    arr = temp;
                }
                arr[valueCount] = a;
                valueCount++;
            }
        }

        boolean[] uniq = new boolean[higher - lower + 1];
        for (int i = 0; i < valueCount; i++) {
            if (lower <= arr[i] && arr[i] <= higher) {
                uniq[arr[i] - lower] = true;
            }
        }

        int uniqCount = 0;
        for (int i = 0; i < uniq.length; i++) {
            if (uniq[i]) {
                uniqCount++;
            }
        }

        System.out.print("V posloupnosti [" + arr[0]);
        for (int i = 1; i < valueCount; i++) {
            System.out.print("," + arr[i]);
        }
        System.out.print("] v intervalu " + lower + " az " + higher);
        System.out.print(": " + uniqCount + " cisla");
        System.out.println();
    }
}
