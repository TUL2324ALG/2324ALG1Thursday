package thursdayzajicek;

public class Tools {
    public static void main(String[] args) {
        
    }
    
    //JV A
    public static int[] sumArray(int[] a, int[] b) {
        int l = a.length;     
        if (a.length < b.length) {
            l = b.length;        
        } 
        int[] c = new int[l];        
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i] = c[i] + b[i];
        }    
        return c;
    }
    
    //JV A
    public static int maxRowNotNull(int[][] a) {
        int r = 0;
        int min_r = 0; 
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    r++;
                }
            }
            if (r <= min_r) {
                min_r = r;
                index = i + 1;
            }
            r = 0;
        }       
        return index;
    }
    
    //JV A
    public static boolean oneMatrix(int[][] a) {        
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] != 1) {
                return false;
            }
        }       
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0 && (i != j)) {
                    return false;
                }
            }
        }              
        return true;
    }
}
