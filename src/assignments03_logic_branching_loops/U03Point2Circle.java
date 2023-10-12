/*
  Napište program, který načte souřadnice bodu a parametry kružnice (souřadnice středu a poloměr) a určí 
  vzájemnou pozici bodu a kružnice.
 */
package assignments03_logic_branching_loops;

import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class U03Point2Circle {

    static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Zadejte souradnice bodu: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Zadejte souradnice stredu kruznice: ");
        double xS = sc.nextDouble();
        double yS = sc.nextDouble();
        System.out.println("Zadejte polomer: ");
        double r = sc.nextDouble();

        //konstanty
        final int ON = 1;
        final int IN = 2;
        final int OUT = 3;
        
        double distance = Math.hypot(x - xS, y - yS);

        final double eps = 1E-5; //0.00001
        // Rada pí. Královcové z přednášky

        int result;
        
        if (Math.abs(distance - r) < eps * r) { //na kruznici r == distance
            result = ON;
        } else if (distance < r) { // uvnitr
            result = IN;
        } else { //(distance > r) vne
            result = OUT;
        }
        
        
        switch(result){
            case ON -> System.out.println("na kružnici");
            case IN -> System.out.println("Uvnitř");
            case OUT -> System.out.println("vně");
            default -> {
                    System.out.println("chyba");
            }
                
                
        }
        
    }

}
