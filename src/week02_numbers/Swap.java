package week02_numbers;

public class Swap {

    public static void main(String[] args) {
        // a.
        int a = 34; 
        int b = 89;
        System.out.println (b + ", " + a);
        
        // b.
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println (a + ", " + b);
        
        // c.
        a = 34;
        b = 89;
        a = a + b; // 123
        b = a - b; // 34
        a = a - b; // 89
        System.out.println (a + ", " + b);
        

    }
    
}
