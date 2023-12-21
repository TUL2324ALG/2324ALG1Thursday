package week11_2darrays;

public class MatrixTools {

    public static void main(String[] args) {
        //double[][] test = new double[2][3];
        double[][] test = {{0, 1, 0},
        {0, 1, 0}};
        System.out.println("Max abs " + maxAbs(test));
        double[][] normTest = normMatrix(test);
        System.out.println("");
        int[][] test2 = {{1, 2},
        {2, 1}};
        int[][] test3 = {{1, 1, 1},
        {0, 1, 1},
        {1, 0, 1}};
        //System.out.println(secDiagonalSymetry(test2));
        //System.out.println(secDiagonalSymetry(test3));
        System.out.println(testStochasticMatrix(test));
    }

    public static double[][] normMatrix(double[][] a) {
        //1. Projdeme pole a najde max absolutni hodnotu
        double maxAbs = maxAbs(a);

        //2. Projdeme pole a kazdy prvek vydelime max absolutni hodnotou
        double[][] b = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j] / maxAbs;
            }
        }
        return b;
    }

    public static double maxAbs(double[][] a) {
        double maxAbs = -Double.MAX_VALUE;
        double absElement;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                absElement = Math.abs(a[i][j]);
                if (absElement > maxAbs) {
                    maxAbs = absElement;
                }
            }
        }
        return maxAbs;
    }

    /* Zapište program, který bude testovat, zda zadaná čtvercová matice celých čísel je symetrická. Symetrii lze 
testovat podle hlavní diagonály, podle vedlejší diagonály, dle vertikální osy, horizontální osy.
     */
    public static boolean mainDiagonalSymetry(int[][] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a[0].length; j++) {
                if (a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean secDiagonalSymetry(int[][] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a[0].length - i - 1; j++) {
                if (a[i][j] != a[a.length - 1 - j][a[0].length - 1 - i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean horizontalSymetry(int[][] a){
        for (int i = 0; i < (a.length/2); i++) {
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] != a[a.length-1-i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean testStochasticMatrix(double[][] test) {
        double sum;
        for (int i = 0; i < test.length; i++) {
            sum = 0; //vynulovani pro kazdy radek
            for (int j = 0; j < test[0].length; j++) {
                if (test[i][j] < 0) {
                    return false;
                }
                sum += test[i][j];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

}
