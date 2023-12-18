/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thrusdaylubianyi;

/**
 *
 * @author Lubianyi-A-7848
 */
public class ThrusdayLubianyi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
            int [] nums = {1,2,3};
        int [] nums2 = {4,2};
        int [] sum = new int[3];
        for (int i = 0; i < sum.length-1; i++) {
            sum[i] = nums[i] + nums2[i] ;
            
                sum[2] = nums[2] ;
            
            
            System.out.println(sum[i]);
           
            
        }
        System.out.println(sum[2]);
        
        
        
        
        
        
        
        
        
        
        for (int i = 0; i < sum.length; i++) {
            if(sum[i] > sum[i+1] && sum[i] > sum[i+2] ){
                System.out.println("row:" + sum[i] +"   neni null");
            }
            
        }
}
