package zapocet_oprava.opravavala;

import java.util.Scanner;

//JV A
public class RowNorms {

    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int sloupce;
        int radky;
        System.out.println("zadejte pocet sloupcu");
        sloupce=sc.nextInt();
        System.out.println("zadehte pocet radku");
        radky=sc.nextInt();
        
        double[][] matice=new double[radky][sloupce];
        
        System.out.println("zadehte hodnoty matice");
        for(int i=0;i<matice.length;i++){
            for(int j=0;j<matice[0].length;j++){
                matice[i][j]=sc.nextDouble();
            }
        }
        
        boolean kladna=positive(matice);
        boolean norm=norm(matice);
        
        System.out.println("je matice kladna: " + kladna);
        System.out.println("jsou radkove normy stejne: " + norm);
        
    }
    public static boolean positive (double[][] a){
        
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]<=0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean norm (double[][] a){
        double[] norm=new double[a.length];
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                //JV dalo se pripadne kontrolovat najednou
//                if(a[i][j]<=0){
//                    return false;
//                }
                norm[i]= norm[i] + a[i][j]*a[i][j];
            }
            norm[i]=Math.sqrt(norm[i]);
        }
        

        for (int i=0;i<norm.length-1;i++){
            if(norm[i]!=norm[i+1]){
                return false;
            }
        }
        return true;
    }
}
