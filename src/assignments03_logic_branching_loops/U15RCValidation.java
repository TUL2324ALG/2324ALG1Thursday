package assignments03_logic_branching_loops;

public class U15RCValidation {

    public static void main(String[] args) {
        int prvniCast = 780123;
        int druhaCast = 3541;
        
        //1. Zjisti prvnych 9 cislic
        //int cislo9 = Integer.parseInt(prvniCast + "" + druhaCast / 10);
        int cislo9 = prvniCast*1000 + druhaCast / 10;
        //2. Zjistit zbytek po deleni 9 cislic 11
        int zbytek = cislo9 % 11;
        //3. Zjistit jaka by mela byt posledni cislice
        int posledniSpravna = (zbytek == 10) ? 0 : zbytek;
        //4. Zjistit zadanou posledni cislici
        int posledniZadana = druhaCast%10;
        
        boolean platne;
        //5. Zjistit jestli se zadana posledni cislice rovna spravny cislici 
        platne = posledniSpravna == posledniZadana;

        if (platne) {
            System.out.println("Cislo je platne");
        } else {
            System.out.println("Cislo je neplatne");
        }

    }
}
