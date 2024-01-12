package zapocet_oprava.opravavotypka;

import java.util.Scanner;

/**
 *
 * @author Votypka-M-da83
 */
public class Average5K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'N';
        do {
            double[] a = new double[10];
            System.out.println("Zadej casy 10ti behu: ");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextDouble();
            }
            double minCas = Double.MAX_VALUE;
            double maxCas = 0;
            double sum = 0;
            double mean = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < minCas) {
                    minCas = a[i];
                }
                if (a[i] > maxCas) {
                    maxCas = a[i];
                }

            }
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            mean = ((sum - minCas - maxCas) / 8) / 5;
            System.out.println("Prumerny cas na 5km je: " + mean + " min");
            System.out.println("Chcete pokracovat? (Y/N)");
            choice = sc.next().charAt(0);
        } while (choice != 'N');

    }

}
