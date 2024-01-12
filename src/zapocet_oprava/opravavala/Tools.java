package zapocet_oprava.opravavala;

public class Tools {

    public static void main(String[] args) {
       //a)
        int[] a={1,2,3};
        int[] b={1,2,3};
        boolean c=areSameArray(a,b);
        System.out.println("pole jsou stejna: " + c);
        
/*        //b)
        int n=10;
        int[][] matice=createOneMatrix(n);

        for(int i=0;i<matice.length;i++){
            System.out.print("[" + matice[i][0]);
            for(int j=1;j<matice[0].length;j++){
                System.out.print(" " + matice[i][j]);
            }
            System.out.println("]");
        }
*/

    }
    //JV nemyslim si, ze bude dobre fungovat - v polich muzou byt libovolna i velka cisla a libovolny pocet cisel 
    public static boolean areSameArray (int[] a, int[] b){
        int[][] c;
        int[] count=new int[10];
        int[] count2=new int[10];
        int[] uncount=new int[10];
        int[] uncount2=new int[10];
        
        if(a.length!=b.length){
            return false;
        }else{
            for(int i=0;i<a.length;i++){
                if (a[i]<0){
                    uncount[-a[i]]++;
                    count2[b[i]]++;
                }else if(b[i]<0){
                    count[a[i]]++;
                    uncount2[-b[i]]++;
                }else if(a[i]<0 && b[i]<0){
                    uncount[-a[i]]++;
                    uncount2[-b[i]]++;
                }else{
                    count[a[i]]++;
                    count2[b[i]]++;
                }
        }
        for(int i=0;i<a.length;i++){
            if(count[i]!=count2[i]){
                return false;
            }
            if(uncount[i]!=uncount2[i]){
                return false;
            }
        }
        
        
        
        
        /*
        if(a.length!=b.length){
            return false;
        }else{
            c=new int[a.length][2];

            for(int i=0;i<a.length;i++){
                for (int j=0;j<a.length;j++){
                    if (c[i][0]==c[j][1]){
                        count[i]++;
                    }
                }
           
            }
            for(int i=0;i<a.length;i++){
                for (int j=0;j<a.length;j++){
                    if (count[i]!=c[j][0]){
                        count[i]++;
                    }
                }
           
            }


        }
*/
        
        return true;
    }
    }
    //JV A
    public static int[][] createOneMatrix (int n){
        int[][] matice=new int [n][n];
        
        for(int i=0;i<matice.length;i++){
            for(int j=0;j<matice[0].length;j++){
                if(i==j){
                    matice[i][j]=1;
                }else{
                    matice[i][j]=0;
                }
            }
        }
        return matice;
    }
    
}
