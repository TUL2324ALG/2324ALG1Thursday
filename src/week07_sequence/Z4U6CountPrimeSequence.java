package week07_sequence;

import java.util.Scanner;

public class Z4U6CountPrimeSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Napište program, kterému je na vstupu zadána posloupnost celých kladných čísel. Program má zjistit a vypsat 
        počet prvočíselných členů zadané posloupnosti. Program modifikujte pro oba způsoby zadávání posloupnosti.
         */
        int number;
        int count = 0;
        boolean prime = true;

        System.out.print("Zadejte pocet prvku posloupnosti: ");
        int n = sc.nextInt();

        System.out.println("Zadejte čísla: ");
        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            //System.out.printf("%d %s prvočíslo\n", number, isPrime(number) ? "je" : "není");
//            if(isPrime(number)) {
//                count++;
//            }
            prime = true;
            if (number < 2) { //limitni validni pripad , 0, 1
                prime = false;
            }
            //mohlo by byt v else
            for (int possibleDivisor = 2; possibleDivisor <= number / 2 && prime; possibleDivisor++) { //i <= Math.sqrt(number)
                if (number % possibleDivisor == 0) {
                    prime = false;
                    //break;
                }
            }
            System.out.println(prime);
            if (prime) {
                count++;
            }

        }

        System.out.println("Počet prvočísel: " + count);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; //limitni validni pripad , 0, 1
        }
        for (int i = 2; i <= number / 2; i++) { //i <= Math.sqrt(number)
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
