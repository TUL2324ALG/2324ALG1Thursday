/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thursdaySpousta;

import java.util.Scanner;

/**
 *
 * @author Spousta-D-879d
 */
public class UniqueInterval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberInInterval;
        int i = 1;
        int[] interval = new int[2];
        int[] helpingArray;
        System.out.println("Zadejte posloupnost");
        while (true){
            numberInInterval = sc.nextInt();
         if (numberInInterval<0) break;
            interval[i-1] = numberInInterval;
            helpingArray = new int[interval.length+1];
            helpingArray = interval;
            interval = new int[1+i];
            i++;
            interval = helpingArray;
            
        }
        for (int j = 0; j < interval.length-1; j++) {
            System.out.println(interval[j]);
            
        }
        
        
    }

}
