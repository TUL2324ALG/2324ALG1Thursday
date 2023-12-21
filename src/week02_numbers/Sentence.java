/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week02_numbers;

import java.time.LocalDate;
import java.util.Scanner;

public class Sentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //in
        String jmeno;
        int rokNarozeni;
        char tridaPismeno;
        
        //zadane napevno
//        jmeno = "Filip";
//        rokNarozeni = 2009;
//        tridaPismeno = "A";

        //zadane uzivatelem
        System.out.println("Zadej jmeno ditete, rok narozeni a pismeno tridy");
        jmeno = sc.next(); //nacitani slova
        rokNarozeni = sc.nextInt(); //nacteni celeho cisla
        tridaPismeno = sc.next().charAt(0); //nacteni znaku
        
        
        final int rokDoSkoly = 6; //konstanta
        //final int rok = 2023;
        int rok = LocalDate.now().getYear();
        
        //vypocty
        int vek = rok - rokNarozeni;
        int tridaCislo = vek - rokDoSkoly;

        
        //out 
        System.out.println("Dite "+ jmeno+ " ma "+ vek + " let a chodi do "
                + tridaCislo+ "."+ tridaPismeno + ".");
        
                
    }
    
}
