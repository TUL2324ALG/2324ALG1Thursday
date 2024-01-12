package zapocet_oprava.opravavala;

import java.util.Scanner;

//JV B
public class Average5K {

    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        double[] casy=new double[10];
        double prumer=0;
        int odpoved=0;
        double max=0;
        double min=0;
        
        while(odpoved==0){
            System.out.println("Zadejte deset casu: ");
            for(int i=0;i<10;i++){ //JV vhodne definovat si 10 jako konstantu
                System.out.println("cas cislo " + (i+1) + ":");
                casy[i]=sc.nextDouble();
                if(casy[i]>max){
                    max =casy[i];
                }else if(casy[i]<min){ //JV nevhodne nainicializované min, zadny cas nebude mensi jako 0 (Double.MAX_VALUE)
                    min =casy[i];
                }
            }

            for(int i=0;i<10;i++){
                //JV snazte se nepouzivat continue, staci napsat podminku opacne
//                if (!(casy[i]==min || casy[i]==max)){
//                    prumer= prumer + casy[i];
//                }
                if (casy[i]==min || casy[i]==max){
                    continue;
                }else{
                    prumer= prumer + casy[i];
                }
            }
            prumer = (prumer/8)/5;

            System.out.println("prumer je: " + prumer + " min");
            
            System.out.println("pro pokracovani v programu zadejte 0, pro ukonceni jinou hodnotu: ");
            odpoved=sc.nextInt();
        }
    }
    
}
