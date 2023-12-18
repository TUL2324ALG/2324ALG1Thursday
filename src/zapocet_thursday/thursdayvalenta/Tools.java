/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thursdayvalenta;

/**
 *
 * @author Valenta-L-5c7a
 */
public class Tools {

//    public static void main(String[] args) {
//        int[] a = {1,2,3};
//        int[] b = {2,2};
//        var c = sumArray(a,b); 
//        int[][] d = {{0,1},{1,1},{1,1}};
//        var e = maxRowNotNull(d);
//        int[][] f = {{1,0,0},{0,2,0},{0,0,1}};
//        var g = oneMatrix(f);
//        System.out.println(); //breakpoint
//    } 
    static public int[] sumArray(int[] a, int[] b) {
        int[] big;
        int[] small;
        if (a.length > b.length) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        int[] res = new int[big.length];

        for (int i = 0; i < small.length; i++) {
            res[i] = a[i] + b[i];
        }
        System.arraycopy(big, small.length, res, small.length, big.length - small.length);

        return res;
    }

    static public int maxRowNotNull(int[][] a) {
        int maxRow = 0;
        int maxNum = 0;
        int num;

        for (int i = 0; i < a.length; i++) {
            num = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    num++;
                }
            }
            if (num >= maxNum) {
                maxRow = i;
                maxNum = num;
            }
        }

        return maxRow;
    }

    static public boolean oneMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

}
