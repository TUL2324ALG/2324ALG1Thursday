
package thrusdayyovenko;
public class Tools {

    public static void main(String[] args) {
     int[]arr1={1, 2, 3}; 
     int[]arr2={4, 2};
    }
    public static int[] sumArray(int[] arr1, int[]  arr2){
       int a=arr1.length;
       int b=arr2.length;
       int maxLength=Math.max(a,b);
       
       int[] result = new int[maxLength];
       for(int i=0; i<maxLength; i++){
           int val1 =(i<a)? arr1[i]:0;
           int val2 =(i<b)? arr1[i]:0;
       }
      return result;
    }
    
    public static int maxRowNotNull(int[][] matrix){
        int maxRow=-1;
        int maxCount=0;
        for(int i=0; i<matrix.length; i++){
            int count=0;
            for(int j=0; j<matrix[i].length;i++){
               if(matrix[i][j] !=0){
                   count++;
               }
            }
        if(count >=maxCount){
            maxRow=i;
            maxCount=count;
        }
        
    }
        return maxRow;
    }
    public static boolean oneMatrix(int[][]matrix){
            if(matrix.length != matrix[0].length){
            return false;
            }
            for(int i=0; i<matrix.length;i++){
                for(int j=0; j<matrix[i].length; j++){
                    if((i==j && matrix[i][j]!=1)||(i!=j && matrix[i][j]!=0)){
                        return false;
                    }
                }
            }
            return true;
        }
    
}
