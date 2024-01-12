/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet_oprava.opravatlusty;

import java.util.Scanner;

/**
 *
 * @author Tlusty-V-75e8
 */
public class Avarage5k {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Zadejte casy na 1km pro ukonceni zadejte 0"); //JV casu bylo presne 10
            double prumCas = sc.nextDouble();
            if (prumCas == 0) { 
                break;
            };
        double nizCas = 0, vysCas = 0;
        int pocet = 0;
        int jedna = 1; 
        int celkovyPocet = 0;
        double prumer = prumCas; //JV v kazdem kroku cyklu si prumer prepisete novou hodnotou, o predchozi prijdete
               prumer +=prumCas;
        if (nizCas>prumCas) {
            nizCas = prumCas;
        };
        if (vysCas<prumCas) {
            vysCas = prumCas;
        }
        if (prumer == prumCas) {
            celkovyPocet = pocet + jedna;
        };
        double prumernyCas = prumer-(nizCas+vysCas)/celkovyPocet; 
            System.out.println("Prumerny cas je: "+prumernyCas);
       } while (true);

    }
    
}
