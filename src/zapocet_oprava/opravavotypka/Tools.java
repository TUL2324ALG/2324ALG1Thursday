package zapocet_oprava.opravavotypka;
/**
 *
 * @author Votypka-M-da83
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static boolean areSameArrays(int[] a, int[] b) {
        boolean sameArrays = true;

        if (a.length != b.length) {
            sameArrays = false;
        }
        int pomA;
        for (int i = 0; i < a.length - 1; i++) { //JV dobry napad pole setridit, ale tento kod jen dostane nejvetsi prvek nakonec
            if (a[i] > a[i + 1]) {
                pomA = a[i];
                a[i] = a[i + 1];
                a[i + 1] = pomA;
            }
        }
        
        int pomB;
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] > b[i + 1]) {
                pomB = b[i];
                b[i] = b[i + 1];
                b[i + 1] = pomB;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                sameArrays = false; //JV pokud najdu prvni dvojici, ktera se nerovna, break nebo return false
            }
        }
        return sameArrays;
    }

    public static double[][] createOneMatrix(int n) {
        double[][] a=new double[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(i==j){
                    a[i][j]=1;
                }else{
                    a[i][j]=0;
                }
            }
        }
    return a;    
    }

}
