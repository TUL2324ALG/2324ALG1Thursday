package thursdaykraus;

public class Tools {

    public static void main(String[] args) {
        // TODO code application logic here

    }
    //JV nebude v nekterych pripadech fungovat
    public static int[] sumArray(int[] pole, int[] pole2) {
        //in
        int delkaPole = 0;
        int[] newArray = new int[delkaPole];
        
        
        
        if (pole.length > pole2.length) {
            delkaPole = pole.length;
        } else if (pole.length < pole2.length) {
            delkaPole = pole2.length;
        }
        for (int i = 0; i < delkaPole; i++) {
            newArray[i] = pole[i] + pole2[i]; //JV pokud neboudou stejne dlouha pole, vyhodi vyjimku
        }

        
        //out
        return newArray;
    }

    //JV nebude fungovat
    public static boolean oneMatrix(int[][] matrix) {
        boolean oneMatrix = true;
        int m = matrix.length;
        int n = matrix[0].length;

        
        
        if (m != n) {
            //Matice neni ctvercova
            oneMatrix = false;
            return oneMatrix;
        }

        for (int i = 0; i < matrix.length && oneMatrix; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] != 1 || matrix[i][j] != matrix[j][i]) { //JV kde kontrolujete nulove prvky
                    oneMatrix = false;
                }
                if (matrix[i][j] != 0 && matrix[i][j] == matrix[j][i]) {
                    oneMatrix = false; //JV kdyz to jednou plati, ukoncit metodu
                }
            }
        }

        return oneMatrix;
    }

    //JV nebude fungovat
    public static int maxRowNotNull(int[][] matrix) {
        int CisloRadku = 0;
        int PocetNenulCisel = 0;
        int PocetCisel = 0;

        
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    PocetNenulCisel++;
                    //System.out.println(matrix[i][j]);
                }
                PocetCisel = PocetNenulCisel; //JV pocetCisel a pocetnenulCisel bude stejny
            }
            if (PocetNenulCisel < PocetCisel) { //JV tohle proto nebude nikdy
                CisloRadku = i;
            }
        }
        
        
        return CisloRadku;
    }
}
