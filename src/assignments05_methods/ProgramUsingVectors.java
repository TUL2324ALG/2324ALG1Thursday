package assignments05_methods;

import java.util.Scanner;

public class ProgramUsingVectors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej pocet bodu");
        int n = sc.nextInt();
        double x, y, z;
        double vectorLength;
        for (int i = 0; i < n; i++) {

            System.out.println("Zadej souradnice 3D bodu");
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            vectorLength = VectorTools.calculateDistance(x, y, z);

            System.out.printf("Delka vetora, ktery konci zadanem bode je %.2f%n", vectorLength);
        }
    }

    /**
     * Calculates length of a 3D vector starting at origin
     * @param x x-coordinates of a vector
     * @param y y-coordinates of a vector
     * @param z z-coordinates of a vector
     * @return length of the 3D vector 
     */
    public static double calculateDistance(double x, double y, double z){
        double distance = Math.sqrt(x*x + y*y + z*z);
        return distance;
    }
}
