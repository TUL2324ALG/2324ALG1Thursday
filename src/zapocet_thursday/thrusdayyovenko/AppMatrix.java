
package thrusdayyovenko;
import java.util.Scanner;
public class AppMatrix {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean continueProgram=true;
        while (continueProgram){
            System.out.println("Zadajte pocet radku: ");
            int r=scanner.nextInt();
            System.out.println("Zadajte pocet sloupcu: ");
            int c = scanner.nextInt();
            
            int[][]matrix= new int[r][c];
            System.out.println("Zadejte hodnoty matice: ");
            for(int i=0; i<r; i++){
            for(int j=0; j<c; i++){
                matrix[i][j]=scanner.nextInt();
                }
            }
            Tools tools =new Tools();
            int maxRow=tools.maxRowNotNull(matrix);
            System.out.println("Cislo radku z nejvice nenulovymi hodnotami: " + (maxRow + 1));
            
            System.out.println("Hodnoty na tomto radku: ");
            for(int val:matrix[maxRow]){
                System.out.println(val+ " ");
            }
            System.out.println();
            
            System.out.println("Pokracujeme?('1' ano/ '2' ne)");
            String response= scanner.next();
            if(response.equalsIgnoreCase("2")){
                continueProgram=false;
            }
        }
        scanner.close();
    }
}
