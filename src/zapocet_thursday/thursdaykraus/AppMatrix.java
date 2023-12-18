package thursdaykraus;

import java.util.Scanner;

public class AppMatrix {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //in
        boolean opakovat = true;
        int m = 0;
        int n = 0;
        int cisloradku = 0;
        Byte odpoved = 1;

        
        
        while (opakovat) {
            System.out.println("Zadejte kladnou delku a sirku matice");
            m = sc.nextInt();
            n = sc.nextInt();
            if (m <= 0 || n <= 0) { //Nulu nemohou zadat zadat protoze pole nemuze byt automaticky jednotkova matice
                System.out.println("zadejte prosim kladne hodnoty");
                opakovat = false;
            }
            int[][] matice = new int[m][n];

            for (int i = 0; i < matice.length; i++) {
                for (int j = 0; j < matice[i].length; j++) {
                    System.out.println("Zadejte hodnoty do matice"); //JV bude vypisovat pred kazdou hodnotou matice
                    matice[i][j] = sc.nextInt();
                }
            }
            cisloradku = Tools.maxRowNotNull(matice);
            System.out.println("Nejvetsi pocet nenulovych cisel ja na radku " + cisloradku); //JV mel jste i vypsat ten radek
            System.out.println("Prejete si opakovat? pokud ano zadejte 1 pokud ne zadejte 2"); //pripadne pres char odpoved A/N
            odpoved = sc.nextByte();
            if (odpoved != 1) {
                opakovat = false;
            }
        }

    }

}
