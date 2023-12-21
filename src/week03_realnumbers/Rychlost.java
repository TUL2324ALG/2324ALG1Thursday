
package week03_realnumbers;

import java.util.Scanner;
public class Rychlost {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej max povolenou rychlost v km/h: ");
        int maxSpeedKmH = sc.nextInt();
        System.out.println("Zadej delku useku v m: ");
        int usekM = sc.nextInt();
        System.out.println("Zadej kdy vjede hh: ");
        int h1 = sc.nextInt();
        System.out.println("Zadej kdy vjede mm: ");
        int m1 = sc.nextInt();
        System.out.println("Zadej kdy vjede ss: ");
        int sec1 = sc.nextInt();
        System.out.println("Zadej kdy vyjede hh mm ss");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int sec2 = sc.nextInt();  
        
        System.out.println("************************");
        
        int cas1 = h1*3600 + m1*60 + sec1;
        int cas2 = h2*3600 + m2*60 + sec2;
        int casPrujezdu = cas2 - cas1;
        double averageSpeed = (double)usekM/casPrujezdu;
        double averageSpeedKmH = averageSpeed*3.6;
        averageSpeedKmH = Math.round(averageSpeedKmH);
        
        System.out.println("Prumerna rychlost: " +averageSpeedKmH);
        
        double rozdil = averageSpeedKmH - maxSpeedKmH;
        
        if (maxSpeedKmH >= averageSpeedKmH){
            System.out.println("Dodrzel limit");
        }
        else{
            System.out.println("Prekocili jste o: " + rozdil);
        }
        
        String vysledek = (maxSpeedKmH > averageSpeedKmH)? "Dodrzel limit" :("Prekocili jste o: " + rozdil); 
        System.out.println(vysledek);
        
            
        }
       
    }

