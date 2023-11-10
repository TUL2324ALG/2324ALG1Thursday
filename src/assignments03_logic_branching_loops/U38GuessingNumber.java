package assignments03_logic_branching_loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import mylibrary.NumbersTools;

public class U38GuessingNumber {

    static Scanner sc = new Scanner(System.in);
    static int min = 1;
    static int max = 100;

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        boolean end = false;
        int choice;
        do {
            openMenu();
            choice = choose();
            switch (choice) {
                case 0:
                    end = true;
                    break;
                case 1:
                    userGuesses();
                    break;
                case 2:
                    computerGuesses();
                    break;
                case 3: 
                    changeRange(); 
                    break;
                default: System.out.println("Neplatna volba");    
            }

        } while (!end);
    }

    private static void openMenu() {
        System.out.println("Vyber volbu:");
        System.out.println("1. Hada uzivatel");
        System.out.println("2. Hada pocitac");
        System.out.println("3. Zmen rozsah");
        System.out.println("0. Konec");
    }

    private static int choose() { //muzu testovat, jestli zadal cislo
        int choice = sc.nextInt();
        return choice;
    }

    private static void changeRange() { //muzu pridat testovani na spravny rozsah
        System.out.println("Zadej dolni mez");
        min = sc.nextInt();
        System.out.println("Zadej horni mez");
        max = sc.nextInt();
    }

    private static void userGuesses() {
        //1. zobrazit rozsah
        System.out.println("Myslim si cislo v rozsahu " + min + " - " + max);
        //2. vygenerovat nahodne cislo v rozsahu
        int randomNumber = NumbersTools.generateRandom(min, max);
        boolean successful = false;
        do{
            //3. vyzvat uzivatele, aby hadal cislo
            System.out.println("Hadej");
            int userNumber = sc.nextInt();
            //4. odpovidat mensi, vetsi, uhodl
            if(randomNumber > userNumber){
                System.out.println("Myslim si vetsi cislo");
            } else if (randomNumber < userNumber){
                System.out.println("Myslim si mensi cislo");
            } else {
                System.out.println("Uhodl si");
                successful = true;
            }
            //opakovat 3,4 dokud neuhodne
        } while(!successful);
        
    }

    private static void computerGuesses() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
