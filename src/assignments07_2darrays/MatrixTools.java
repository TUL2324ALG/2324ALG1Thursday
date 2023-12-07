package assignments07_2darrays;

public class MatrixTools {

    public static void main(String[] args) {
        double[][] matrix = {{1, 2, 0}, //staticky inicializator
        {3, 4, -4},
        {-5, 2, 4}
        };
        int[][] matrix2 =       {{1, 2, 2}, //staticky inicializator
                                {2, 1, 2},
                                {1, 2, 3}};
       //symetricMainDiag(matrix2);
        System.out.println(symetricHorz(matrix2));
        double[][] normMatrix = normMatrix(matrix);
        System.out.println("");
    }

    public static double[][] normMatrix(double[][] a) {
        //zjisteni maxAbs
        double maxAbs = -1;//-Double.MAX_VALUE; //nejmensi double
        double absElement;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) { //pruchod 1d pole s hodnotama na i radku
                absElement = Math.abs(a[i][j]);
                if (absElement > maxAbs) {
                    maxAbs = absElement;
                }
            }
        }
        //deleni vsech prvku maxAbs
        double[][] b = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j] / maxAbs;
            }
        }
        return b;
    }

    public static boolean stochastic(double[][] a) {
        boolean stochasticMatrix = true;
        double sum;
        for (int i = 0; i < a.length && stochasticMatrix; i++) {
            sum = 0;
            for (int j = 0; j < a[i].length && stochasticMatrix; j++) {
                if (a[i][j] < 0) {
                    stochasticMatrix = false;
                    //return stochasticMatrix;
                }
                sum = sum + a[i][j];
            }
            if (sum != 1) {
                stochasticMatrix = false;
                //return stochasticMatrix;
            }
        }
        return stochasticMatrix;
    }

    public static boolean symetricMainDiag(int[][] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a[i].length; j++) {
                if (a[i][j] != a[j][i]) {
                    return false;
                }

            }
        }
        return true;
    }
    public static boolean symetricAntiDiag(int[][] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a[0].length-1-i; j++) {
                if (a[i][j] != a[a.length-1-j][a[i].length-1-i]) {
                    return false;
                }

            }
        }
        return true;
    }
    public static boolean symetricVert(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length/2; j++) {
                if (a[i][j] != a[i][a[i].length-1-j]) {
                    return false;
                }

            }
        }
        return true;
    }
    public static boolean symetricHorz(int[][] a) {
        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != a[a.length-1-i][j]) {
                    return false;
                }

            }
        }
        return true;
    }
}
