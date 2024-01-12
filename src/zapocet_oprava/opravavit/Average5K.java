/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapocet_oprava.opravavit;

import java.util.Scanner;

/**
 *
 * @author Vit-V-298b
 */
public class Average5K {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isRunning = false;

        System.out.println("1)Start\n2)Konec");

        int choice = sc.nextInt();
        while (!isRunning) {
            switch (choice) {
                case 1:
                    count();
                case 2:
                    isRunning = true;
            }

        }
        sc.close();
    }

    public static void count() {

        Scanner sc = new Scanner(System.in);

        double[] runArray = new double[10];

        System.out.println("Zadej svých 10 tréninogvých běhů na 5km");

        for (int i = 0; i < 10; i++) {

            runArray[i] = sc.nextDouble();

        }

        double slowest = 0;
        double fastest = 0;

        double slowTemp = 0;
        double fastTemp = 0;

        for (int i = 0; i < runArray.length; i++) {

            slowest = i;
            fastest = i;
            if (i++ < slowest) { //JV porovnavate indexy, je potreba porovnavat hodnoty na indexech 
                slowest = i;
            }
            if (i++ > fastest) {
                fastest = i;
            }
        }

        System.out.println(slowest + " " + fastest);

    }
}
