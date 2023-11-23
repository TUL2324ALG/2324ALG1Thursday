package assignments06_arrays;

import assignments05_methods.NumbersTools;

public class ArrayTools {

    public static void main(String[] args) {
        int[] myArray = {4, 9, 3, 1, 9};//staticky inicializator
        int[] myArray2 = {3, 2, 2, 1, 0};
        print(myArray);
       // print2(myArray);
//        System.out.println(addition(myArray));
//        System.out.println(maxValue(myArray));
//        System.out.println(indexMaxFirst(myArray));
//        System.out.println(indexMaxLast(myArray));
//        System.out.println(vyskytZadaneHodnoty(myArray, 10));
//        System.out.println(jeSestupne(myArray2));
//        System.out.println(jeVzestupne(myArray2));
//        System.out.println(ReverseValue(myArray));
        print(reverseValue(myArray));
        int n = 10;
        print(permutace(n));
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void print2(int[] a) {
        System.out.print("[");
//        for(int i = 0; i < a.length; i++){
//            if(i == a.length -1){ //neni optimalni
//                System.out.print(a[i]);
//            }else{
//                System.out.print(a[i] + ", ");
//            }
//        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1]);
        System.out.println("]");
    }

    public static int addition(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int maxValue(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static int minValue(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    /**
     * Return the index of the first occurence of the maximal value in the array
     *
     * @param a array not null nor empty
     * @return index of the fist occurence of the maximal value form 0 to
     * a.length -1
     */
    public static int indexMaxFirst(int[] a) {
        int max = Integer.MIN_VALUE;
        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                pos = i;
            }
        }
        return pos;
    }

    public static int indexMaxLast(int[] a) {
        int max = Integer.MIN_VALUE;
        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i]) {
                max = a[i];
                pos = i;
            }
        }
        return pos;
    }

    public static int vyskytZadaneHodnoty(int[] a, int b) {
        int pocet = 0;
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                pocet++;
            }
        }
        return pocet;

    }

    public static boolean jeSestupne(int[] a) {
        boolean sestupnost = true;
        for (int i = 0; i < a.length -1; i++) {
            if (a[i] < a[i + 1]) {
                sestupnost = false;
                break;
            }
        }
        return sestupnost;
    }
    
    public static boolean jeSestupne1(int[] a) {
        boolean sestupnost = true;
        for (int i = 0; i < a.length -1 && sestupnost; i++) {
            if (a[i] < a[i + 1]) {
                sestupnost = false;
            }
        }
        return sestupnost;
    }
    
    public static boolean jeSestupne2(int[] a) {
        for (int i = 0; i < a.length -1; i++) {
            if (a[i] < a[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean jeVzestupne(int[] a) {
        boolean vzestupnost = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                vzestupnost = false;
                break;
            }
        }
        return vzestupnost;

    }
    //neupravuje puvodni, vytvari a vraci nove pole
    public static int[] reverseValue(int[] a) {
        int[] output = new int[a.length];
            for (int i = 0; i < a.length; i++) {
            output[a.length-1-i]=a[i];   
        }
        return output;
    }
    
    //menim puvodni pole a teda nic nevracim
    public static void reverseValue1(int[] a){
        int temp;
        for (int i = 0; i < a.length/2; i++) {
            temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }
    
    //pretizeni metody, overload
//    public static int[] reverseArray(double[] a){
//        
//    }
    
    
    public static int[] permutace(int n){
        int[] a = fillFrom1To(n);
        fisherYatesShuffle(a);
        return a;
    }
    
    public static int[] fillFrom1To (int n){
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i+1;
        }
        return a;
    }
    
    //-- To shuffle an array a of n elements (indices 0..n-1):
        //for i from n−1 down to 1 do
        //     j ← random integer such that 0 ≤ j ≤ i
        //     exchange a[j] and a[i]
    public static void fisherYatesShuffle(int[] a){
        int j = 0;
        int temp = 0;
        int n = a.length;
        for(int i = n-1; i > 0; i--) {
            j = (int)(Math.random() * (i+1));
            //j = NumbersTools.generateRandom(0, i);
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

}
