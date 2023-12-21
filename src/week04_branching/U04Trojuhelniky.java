/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week04_branching;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class U04Trojuhelniky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 2;
        double b = 5;
        double c = 6;
        
        boolean triangle = (a + b >c ) &&
                           (a + c > b) &&
                           (b + c >a );
        //triangle = isTriangle(a, b, c);
        
        System.out.println(((triangle)?"Lze":"Nelze") 
                + "sestrojit trojuhelnik s temito stranami");
    }
    
    public static boolean isTriangle(double a, double b, double c)
    {
        return  (a + b >c ) && 
                (a + c > b) && 
                (b + c >a );
    }
    
}
