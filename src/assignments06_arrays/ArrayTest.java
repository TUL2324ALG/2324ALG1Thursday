
package assignments06_arrays;
import java.util.Scanner;

public class ArrayTest {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Zadejte kolik chcete prvku v poli");
        int[] pole=new int[sc.nextInt()];
        System.out.println("Muzete zadavat prvky");
        for (int i = 0; i < pole.length; i++) {
            pole[i]=sc.nextInt(); 
        }
        System.out.print("Puvodni pole: ");
        ArrayTools.print(pole);
        System.out.println("");
        System.out.print("Obracene pole: ");
        ArrayTools.print(ArrayTools.reverseValue(pole));
        
    }
    
}
