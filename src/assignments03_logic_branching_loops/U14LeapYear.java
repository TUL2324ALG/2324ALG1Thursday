package assignments03_logic_branching_loops;
import java.util.Scanner;
public class U14LeapYear {

    private static final Scanner sc = new Scanner (System.in); 
    public static void main(String[] args) {
        System.out.println("Zadej rok: ");
        int rok = sc.nextInt();
        boolean prestupnost;
        
        prestupnost = (rok%4 == 0 && rok%100 != 0) || rok%400 == 0;

        System.out.println("rok " + ((prestupnost)?"je":"není") + " přestupný");
    }
}
