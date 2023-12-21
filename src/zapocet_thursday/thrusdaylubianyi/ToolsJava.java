
package thrusdaylubianyi;


public class ToolsJava {
    public static void main(String[] args) {
        int[][] test = {{3,3,3},{1,2,0},{1,0,0}} ;
        int[][] test2 = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}} ;
        maxRowNotNull(test);
        OneMarix(test2);
        System.out.println(OneMarix(test2));
    }
    public static int[] sumArray(int[] a){//JV vstup byly 2 pole
        int [] nums = {1,2,3};
        int [] nums2 = {4,2};
        //int [] sum = new int[3];
        for (int i = 0; i < a.length-1; i++) {
            a[i] = nums[i] + nums2[i] ;
            a[2] = nums[2] ;
            System.out.println(a[i]); //JV nevypisovat v metode
        }
        System.out.println(a[2]);
        return a;
    }
    
    //JV skoro dobre
    public static int[][] maxRowNotNull(int[][] matrix){ //JV melo vracet cislo radku, ne dvourozmerne pole
        int result = 0;
        int correctCount = 0;
        
        int[] sum = new int [matrix.length] ;
        for (int i = 0; i < matrix.length; i++) {
            
           
            correctCount = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] > 0){
                    correctCount += 1 ;  
            }
                
                
            }
            sum[i] = correctCount ;
            
        }
         for (int i = 0; i < sum.length; i++) {
            int max;
            max = sum[0]; //JV asi si nechcete v kazdem kroku prepisovat max
            if(max < sum[i]){
                max = sum[i] ;
                result = max ;
            }

        }
        System.out.println(result + "Radek"); //JV v metode nevypisovat, vracet hodnotu
        
        
        return matrix;
    }
    public static boolean OneMarix(int[][] matrix ){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][i] != 1 && matrix[i][j] != 0){ //JV pro kazdy prvek na radku, hned kontrolujete i diagonalni prvek  
                    return false;
                   
                }

                
            }
            
        }
        
        
        
        
        
        return true;
    }
    
    
    
    
}
