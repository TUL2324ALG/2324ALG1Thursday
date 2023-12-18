
package thursdayvotypka;
import java.util.Scanner;
/**
 *
 * @author Votypka-M-da83
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    /**
     * @param b
     * @param a
     * @return
     */
    public static int[] sumArray(int[] a,int[] b){
    
    int[] sumArray=new[];
    for(int i=0;i<a.length;i++){
        a=a[i];    
    }
    
    
    return sumArray;
    }
    /**
     *
     * @param myArray
     * @return
     */
    public static int[][] maxRowNotNull(int[][] myArray){
    int zeroCount=0;
    for(int i=0;i<myArray.length;i++){
        for(int j =0;j<myArray[0].length;j++){
            while(myArray[i][j]==0){
                zeroCount++;
            }
        }
    }
    return myArray;
    }
    public static boolean oneMatrix(int[][] Array){
        boolean isOneMatric=true;
        for(int i=0;i<Array.length;i++){
            for(int j =0;j<Array[0].length;j++){
                if(Array[i][i]!=1 && Array[i][j]-Array[i][i]!=0){
                    isOneMatric=false;
                }
            }
    }
    return isOneMatric;
    }
}
