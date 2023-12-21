package thursdayvala;
import java.util.Scanner;
/**
 *
 * @author Vala-F-11f8
 */
public class AppMatrix {

    /**
     * @param args the command line arguments
     */
    
    //funguje správně (až na externí metodu)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odpoved=0;
        while (odpoved==0) {
            

            System.out.println("Zadejte velikost matice");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int [][] matrix = new int [a][b];
            System.out.println("Ted budete zadavat hodnoty matice");
            for (int i=0; i<matrix.length; i++){
                for (int j=0; j<matrix[0].length; j++){
                    System.out.println("Zadejte hodnotu");
                    matrix[i][j] = sc.nextInt();
                }
            }      

            System.out.println(Tools.maxRowNotNull(matrix));
            Tools.maxRowNotNull(matrix);//JV proc volate 2x externi metodu

            System.out.println("Chcete pokracovat");
            odpoved = sc.nextInt();
        }
    }
    
}
