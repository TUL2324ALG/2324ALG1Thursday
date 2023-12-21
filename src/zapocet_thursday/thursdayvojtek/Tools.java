/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thursdayvojtek;

/**
 *
 * @author Vojtek-M-a1c7
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*//test sumArray
        int[] a = {1,2,3};
        int[] b = {4,2};
        int[] vys = sumArray(b,a);
        for (int i = 0; i < vys.length; i++) 
        {
            System.out.print(vys[i]+" ");
        }
        */
        /* test maxRowNotNull
        int[][] a ={
            {0,2,0,0},
            {0,3,2,5},
            {0,0,0,0},
            {0,0,2,3},
        };
        int[] vys = maxRowNotNull(a);
        for (int i = 0; i < vys.length; i++) 
        {
            System.out.print(vys[i]+" ");
        }
        */
        
        int[][] a ={
            {1,0,0,0},
            {0,1,0,0},
            {0,0,1,0},
            {0,2,0,1},
        };
        System.out.println(oneMatrix(a));
    }
   
    //JV A
    public static int[] sumArray(int[] a, int[] b)
    {        
        if (a.length<b.length)
        {
           int[] pom = a;
           a = b;
           b = pom;
        }
        
        int [] vysledek = new int[a.length];
        
        for (int i = 0; i < a.length; i++) 
        {
            if(i<b.length)
            {
                vysledek[i]=a[i]+b[i];
            }else
            {
                vysledek[i]=a[i];
            }
            
            
        }
        return vysledek;
    }
    
    //JV A/B
    public static int[] maxRowNotNull(int[][] a)
    {
        int[]vysledek =new int[5];
        int max=Integer.MIN_VALUE;
        int radek=0;
        for (int i = 0; i < a.length; i++) 
        {
            int nenul =0;
            for (int j = 0; j < a[i].length; j++) 
            {
                if(a[i][j]>0) //JV nenulove muze byt i zaporne
                {
                    nenul++;
                }
            }
            if(nenul>=max)
            {
                max=nenul;
                radek = i;
            }
            
        }
        vysledek = a[radek];
        return vysledek;
    }
    
    public static boolean oneMatrix(int[][] a)
    {
        boolean vysledek = true;
        if(a.length != a[0].length)
        {
            vysledek = false;
        }else
        {//normálně pokračuji
            for (int i = 0; i < a.length; i++) 
            {
                for (int j = 0; j < a[i].length; j++) 
                {
                    if(a[i][j]!=0)
                    {   
                        if(i==j)
                        {
                            if(a[i][j]!=1 )
                            {
                            vysledek = false;
                            break;
                            }
                        }else
                        {
                            vysledek = false;
                        break; //JV pozor break ukoncuje jen nejblizsi cyklus
                        }
                        
                    }
                    
                }
                
            }
        }
        
        
        return vysledek;
    }
    /**
     * Hledá řádek a v matici b
     * @param a
     * @param b
     * @return 
     */
    public static int maxRowNotNullLine(int[][] a) //JV tuto metodu tu uz jednou mate, stacilo zavolat a eventualne pridat +1
    {        
        int max=Integer.MIN_VALUE;
        int radek=0;
        for (int i = 0; i < a.length; i++) 
        {
            int nenul =0;
            for (int j = 0; j < a[i].length; j++) 
            {
                if(a[i][j]>0)
                {
                    nenul++;
                }
            }
            if(nenul>=max)
            {
                max=nenul;
                radek = i;
            }
            
        }
        
        return radek+1;
    }
    
}
