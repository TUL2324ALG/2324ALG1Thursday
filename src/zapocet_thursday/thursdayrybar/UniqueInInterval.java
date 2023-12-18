package thursdayrybar;

import java.util.Scanner;

public class UniqueInInterval {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[100];
        System.out.println("Zadej cisla, ukonci zapornou hodnotou.");
        int cislo;
        int i = 0;
        while ((cislo = sc.nextInt()) >= 0) {
            arr[i] = cislo;
            i++;
            if (i == arr.length - 1) {
                arr = resizeArray(arr);
            }
        }
        System.out.println("Zadej interval - min: ");
        int min = sc.nextInt();
        System.out.println("Zadej interval - max: ");
        int max = sc.nextInt();

        if (min < 0 || max < 0 || max > arr.length) {
            return;
        }
        int uniqueNums = uniqueNumbers(arr, min, max);

        System.out.println();
        System.out.println("V posloupnosti ");
        printNiceArray(arr, i);
        System.out.println(" v intervalu " + min + " až " + max + ": " + uniqueNums + " čísel");

    }

    private static void printNiceArray(int[] arr, int to) {
        System.out.print("[");
        for (int i = 0; i < to; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }

    private static int[] resizeArray(int[] arr) {
        int[] a = new int[arr.length * 2]; // je dobre zvetsovat na dvojnasobek puvodni kapacity
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }
        return a;
    }

    public static int uniqueNumbers(int[] arr, int start, int end) {
        int[] uniq = new int[end - start + 1]; // pocet cisel v danem intervalu
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= start && arr[i] <= end) {
                if (uniq[arr[i] - start] == 0) {
                    uniq[arr[i] - start] = 1;
                    count++;
                }
            }
        }
        return count;
    }
}