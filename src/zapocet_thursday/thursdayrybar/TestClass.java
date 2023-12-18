package thursdayrybar;

import java.util.Arrays;

/**
 * trida pro testovani prostredku
 * @author Rybar1-D-5391
 */
public class TestClass {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,2};
        
        System.out.println(Arrays.toString(Tools.sumArray(arr1, arr2)));
        
        int[][] mat = {{1,0,0}, {0,1,0}, {0,0,1}};
        System.out.println(Tools.isOneMatrix(mat));
    }
    
}