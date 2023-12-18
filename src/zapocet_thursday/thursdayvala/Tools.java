package thursdayvala;

/**
 *
 * @author Vala-F-11f8
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {4,2};
        int [][] matrix = {{1,0,0},
            {0,1,0},
            {0,0,1}};
        
        sumArray(a,b);//dod2lat v7pis pro kontrolu
        System.out.println(sumArray(a,b));
        maxRowNotNull(matrix);//dod2lat v7pis pro kontrolu
        System.out.println(maxRowNotNull(matrix));
        oneMatrix(matrix);//dod2lat v7pis pro kontrolu
        System.out.println(oneMatrix(matrix));
        }
    public static int [] sumArray (int [] a, int [] b){
        int [] c = new int [a.length];
        if (a.length<b.length){
            c = new int [b.length];
        } 
        
        for (int i=0; i<a.length-1 && i<b.length-1; i++){
            c[i]=a[i] + b[i];
        }
        return c;
    }
    public static int maxRowNotNull (int [][] a){
        int [] count = new int [a.length];
        int max =0;
        
        for (int i=0; i<a.length-1; i++){
            for (int j=0; j<a[0].length-1; j++){
                if (a[i][j]!=0){
                    count[i]++;
                }else{
                    count[i]=0;
                }
            }      
        }
  
        for (int i=0; i<count.length-1;i++){
            if (count[i]>=max){
                max=i;
            }
        }
        return max;
    }
    //funguje správně
    public static boolean oneMatrix (int [][] a){
        boolean truth = true;
        if (a.length!=a[0].length){
            return false;
        } 
        
        for (int i=0; i<a.length-1; i++){
            for (int j=0; j<a[0].length-1; j++){
                if (i==j && a[i][j]!=1){
                    truth = false;
                    return truth;
                }else if(i!=j && a[i][j]!=0){
                    truth = false;
                    return truth;
                }
            }      
        }
        return truth;
    }
}
