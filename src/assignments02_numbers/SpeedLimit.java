package assignments02_numbers;

import java.util.Scanner;

public class SpeedLimit {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Zadej maximální rychlost úseku v km/h:");
        int maxRychlost = sc.nextInt();
        
        System.out.println("Zadej délku úseku v km: ");
        double usek = sc.nextDouble();
        
        //Prijezd
        System.out.println("Zadej hodinu příjezdu do úseku: ");
        int hhPrijezd = sc.nextInt();
        System.out.println("Zadej minutu příjezdu do úseku: ");
        int mmPrijezd = sc.nextInt();
        System.out.println("Zadej sekundu příjezdu do úseku: ");
        int ssPrijezd = sc.nextInt();
        //Odjezd
        System.out.println("Zadej hodinu odjezdu do úseku: ");
        int hhOdjezd = sc.nextInt();
        System.out.println("Zadej minutu odjezdu do úseku: ");
        int mmOdjezd = sc.nextInt();
        System.out.println("Zadej sekundu odjezdu do úseku: ");
        int ssOdjezd = sc.nextInt();        
        //Vypocet
        int hh = hhOdjezd - hhPrijezd;
        int mm = mmOdjezd - mmPrijezd;
        int ss = ssOdjezd - ssPrijezd;
        double casvhodinach = hh + ((double)mm/60) + ((double)ss/3600);
        double prumRychlost = usek/casvhodinach;
        double prekroceni = prumRychlost-maxRychlost;
        System.out.println("Čas ve formátu (HH:MM:SS): " + hh + ":" + mm + ":" + ss);
        System.out.format("Čas v hodinách: %.2f\n",casvhodinach);        
        System.out.format("Průměrná rychlost v km/h: %.2f\n", prumRychlost);        
        System.out.println("Ridič překročil rychlost o " +prekroceni +" km/h");
    }
    
}
