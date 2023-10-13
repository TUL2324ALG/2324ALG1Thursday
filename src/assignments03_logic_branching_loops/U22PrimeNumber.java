package assignments03_logic_branching_loops;

import java.util.Scanner;

/**
 * Zapište program, který bude určovat, zda zadané číslo je prvočíslo. Porovnání
 * případu, kdy budeme testovat všechny potenciální dělitele nebo ukončíme
 * cyklus při nalezení prvního dělitele (předčasné ukončení cyklu zajistit
 * podmínkou v záhlaví příkazu while a nikoli příkazem break). Modifikace pro
 * opakované zadávání čísel Test: 9, 11, 0
 */
public class U22PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char odpoved = 'A';
        while (odpoved == 'A'||odpoved=='a') {

            System.out.println("Zadej cislo:");
            int cislo = sc.nextInt();
            //int cislo = 0;
            boolean prvocislo = true;
            int limit = cislo / 2;
            int delitel = 2;

            //limitni stavy, trivialni, jine pripady, ktere vyzaduju nebo muzou mit jiny algoritmus
            if (cislo <= 1) {
                prvocislo = false;
            }

            while (delitel <= limit && prvocislo) {
                if (cislo % delitel == 0) { //podminka, kdyz je splnena, muzu ukoncit cyklus - ptali sa na je prvocislo, vhodnejsi zjistovat jestli neni
                    prvocislo = false;
                    //break;
                }
                delitel++;
            }
            System.out.println("Číslo " + cislo + ((prvocislo) ? " je" : " není") + " prvočíslem.");

            
            System.out.println("Chcete pokracovat:");
            odpoved = sc.next().charAt(0);

        }

    }

}
