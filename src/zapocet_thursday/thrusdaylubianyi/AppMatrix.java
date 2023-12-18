
package thrusdaylubianyi;
import java.util.Scanner ;
import static thrusdaylubianyi.ToolsJava.maxRowNotNull;

public class AppMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Vybor");
        int choice;
        int end = 0;
        int row;
        int colt;
        do{
            System.out.println("1 - do");
            System.out.println("2  - stop");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Napiste svou matice");
                    System.out.println("Radek");
                    row = sc.nextInt();
                    System.out.println("Stoubec");
                    colt = sc.nextInt();
                    int [][] matice = new int[colt][row] ;
                    for (int i = 0; i < matice.length; i++) {
                        System.out.println("Napiste radek :" +i);
                        for (int j = 0; j < matice[0].length; j++) {
                            matice[i][j] = sc.nextInt();
                            
                        }
                        
                    }
                     maxRowNotNull(matice);
                
                
                
                case 2:
                    end = 0;
            }
           
            
            
            
            
        } while(end !=0 ) ;
        
    }
}
