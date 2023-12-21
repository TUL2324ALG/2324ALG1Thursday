package week09_arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class ArrayTools {

    //testing
    public static void main(String[] args) {
        int[] b = {1, 3, 5, 4, 2};
        reverse1(b);
        System.out.println(ArrayTools.toString(b));
        System.out.println(Arrays.toString(randomArray(5, -8, -7)));
        System.out.println(Arrays.toString(reverse(b)));
        System.out.println(pocetHodnot(b, 4));
        System.out.println(ArrayTools.sum(b));
        System.out.println(ArrayTools.multiply(b));
        FisherYates(b);
        System.out.println(Arrays.toString(b));
    }

    //metody procesingu - neni tam Scanner ani sout
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int multiply(int[] a) {
        int mult = 1;
        for (int i = 0; i < a.length; i++) {
            mult = mult * a[i];
        }
        return mult;
    }

    public static int max(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int minIndex(int[] a) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1; //neexistujici index
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) { //prvni vyskyt
                //if(a[i] <= min){ //posledni vyskyt
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int pocetHodnot(int[] a, int value) {
        int pocet = 0;
        for (int i = 0; i < a.length; i++) {
            if (value == a[i]) {
                pocet++;
            }
        }
        return pocet;
    }

    //nemenim puvodni pole, ale vytvarim a vracim nove pole
    public static int[] reverse(int[] a) {
        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[a.length - i - 1];
        }
        return temp;
    }

    //menim puvodni pole, nic nevracim
    public static void reverse1(int[] a) {
        int temp;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static int[] randomArray(int size, int min, int max) {
        int[] c = new int[size];
        for (int i = 0; i < size; i++) {
            c[i] = (int) Math.round(Math.random() * (max - min) + min);
        }
        return c;

    }

    public static String toString(int[] a) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < a.length - 1; i++) {
            sb.append(a[i]).append(",");
        }
        sb.append(a[a.length - 1]);
        sb.append("]");
        return sb.toString();
    }

    public static void FisherYates(int[] a) {
        Random nahoda = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int j = nahoda.nextInt(i+1); //nextInt generuje od 0 (vcetne), argument (ne vcetne)
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }
    
    public static int[] permutate(int n){
        int[] a = fillToN(n); //vytvorim pole hodnot od 1..n
        FisherYates(a); //pole zamicham
        return a;
    }
    
    public static int[] fillToN(int n){
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1; 
        }
        return a;
    }
}
