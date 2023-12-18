package thursdayrybar;

public final class Tools {

    private Tools() {
    }

    public static int[] sumArray(int[] first, int[] second) {
        int[] newArr = new int[Math.max(first.length, second.length)];
        for (int i = 0; i < first.length; i++) {
            newArr[i] += first[i];
        }
        for (int i = 0; i < second.length; i++) {
            newArr[i] += second[i];
        }
        return newArr;
    }

    public static int maxRowNotNull(double[][] mat) {
        int[] zeroCount = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    zeroCount[i]++;
                }
            }
        }
        int min = zeroCount[0];
        int index = zeroCount.length - 1;
        for (int i = 1; i < zeroCount.length; i++) {
            if (min >= zeroCount[i]) {
                min = zeroCount[i];
                index = i;
            }
        }

        return index;
    }

    public static boolean isOneMatrix(int[][] mat) {
        if (mat.length != mat[0].length) { // matice musi byt ctvercova
            return false;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j && mat[i][j] != 1) {
                    return false;
                }
                if (i != j && mat[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}