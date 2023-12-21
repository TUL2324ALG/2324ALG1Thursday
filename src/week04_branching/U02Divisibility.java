package week04_branching;

public class U02Divisibility {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        boolean isDivisible;
        
//        //if-else
//        if(a%b == 0){
//            isDivisible = true;
//        }else {
//            isDivisible = false;
//        }
//        //ternarni operator
//        isDivisible = (a%b == 0)?true:false;
        
        isDivisible = a%b == 0;
        
        System.out.println(isDivisible);
    }
    
}
