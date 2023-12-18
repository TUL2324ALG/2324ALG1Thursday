
package thrusdayyovenko;

import java.util.Scanner;

public class UniqueInterval {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte cela, nezaporna cisla'(ukoncete zapornou hodnotou)': ");
        int[] num = new int[1000];
        int count=0;
        int input;
        while((input=scanner.nextInt())>=0){
            num[count++]=input;
            }
        System.out.println("Zadejte zacatek intervalu: ");
        int start = scanner.nextInt();
        System.out.println("Zadejte konec intervalu: ");
        int end=scanner.nextInt();
        int[] uniqueNum = new int[1000];
        int uniqueCount=0;
        boolean[] visited=new boolean[1000000];
        for(int i=0;i<count;i++){
            int n = num[i];
            if(n>=start && n<=end && !visited[n]){
                uniqueNum[uniqueCount++]=n;
                visited[n]=true;
                }
            }
        System.out.println("V poslopnosti [");
        for(int i=0;i<count;i++){
            if(i>0){
                System.out.print(",");
        }
        System.out.print(num[i]);
        }
    System.out.println("] v intervalu " + start + "az" + end + ":" + uniqueCount + "cisla.");
    scanner.close();
    }
}
