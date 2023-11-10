package assignments03_logic_branching_loops;

import java.util.Scanner;

public class U32LineStars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet hvezdicek");
        int count = sc.nextInt();
        //volani metody
        printLineOfStars(count);
//        for(int i = 0; i < n; i++){
//            System.out.print("* ");
//        }
//        System.out.println("");
        System.out.println("Zadej symbol");
        char symbol = sc.next().charAt(0);
        printLineOf(count, symbol);
    }
    
    //deklarace, implementace metody 
    /**
     * Print a line composed of n stars
     * @param n number of stars
     */
    public static void printLineOfStars(int n){
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println("");
          //printLineOf(n, '*'); //pomoci vseobecne metody, udelam specializovanou
    }
    
    //deklarace, implementace metody 
    public static void printLineOf(int n, char symbol){
        for(int i = 0; i < n; i++){
            System.out.print(symbol);
        }
        System.out.println("");
    }
    
}
