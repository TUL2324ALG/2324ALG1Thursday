package assignments01_introduction;

public class Swap {

    public static void main(String[] args) {
        int a, b;
        //a)
        a = 34;
        b = 89;
        
        System.out.println(b + ", " + a);
       
        //b)
        a = 34;
        b = 89;
        int c;
        
        c = a;
        a = b;
        b = c;
        
        System.out.println(a + ", " + b);
       
        //c)
        a = 34;
        b = 89;

        a = a + b;
        b = a - b;
        a = a - b;
       
        System.out.println(a + ", " + b);
    }
    
}
