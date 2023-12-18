/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thursdayZmolik;

/**
 *
 * @author Zmolik-V-50b5
 */
public class Tools { //JV samostatné metody, tak je nedelat instancni ale staticke, (nemaji spolecne atributy nad kterymi by pracovali)
    //, pak neni potreba vytvaret objekt

    //JV A/B
    public int[] sumArray(int[] field1, int[] field2) {
        int sizeMax = 0;
        int sizeMin = 0;

        if (field1.length >= field2.length) {
            sizeMax = field1.length;
            sizeMin = field2.length;
        } else {
            sizeMax = field2.length;
            sizeMin = field1.length;
        }
        int[] soucet = new int[sizeMax];

        for (int i = 0; i < sizeMin; i++) {
            soucet[i] = field1[i] + field2[i];
        }

        for (int i = sizeMin; i < sizeMax; i++) {//JV bylo by lepsi ulozit si, ktere pole je mensi a ktere vetsi - ne jenom velikost 
            if (field1.length > field2.length) {
                soucet[i] = field1[i];
            } else if (field1.length < field2.length) {
                soucet[i] = field2[i];
            }
        }

        return soucet;
    }
    //JV A

    public int maxRowNotNull(int[][] matrix) {
        int rowNum = 0;
        int[] numNotZeroInRow = new int[matrix.length];

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[j].length; i++) {
                if (matrix[j][i] != 0) {
                    numNotZeroInRow[j]++;
                }
            }
        }

        int highNum = 0;
        for (int i = 0; i < numNotZeroInRow.length; i++) {
            if (numNotZeroInRow[i] >= highNum) {
                highNum = numNotZeroInRow[i];
                rowNum = i;
            }
        }
        rowNum++;

        return rowNum;
    }
    
    //JV B
    public boolean onMatrix(int[][] matrix) {
        boolean isOneMatrix = true;
        if (matrix[0].length != matrix.length) {
            System.out.println("Matice není čtvercová"); //JV vracet false, nebo vyhazovat vyjimku - v metodach nevypisovat na konzoli
        } else {
            for (int i = 0; i < matrix[0].length; i++) {
                int tempNum = 0;
                for (int num : matrix[i]) {
                    tempNum += num;
                }
                if (matrix[i][i] != 1 || tempNum != 1) {
                    isOneMatrix = false; //JV pokud jednou plati, nepotrebuju pokracovat dal return
                }
            }
        }

        return isOneMatrix;
    }
}
