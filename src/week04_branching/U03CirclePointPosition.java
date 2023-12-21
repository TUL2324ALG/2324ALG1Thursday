/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week04_branching;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class U03CirclePointPosition {

    public static void main(String[] args) {

        //(x-x0)^2+(y-y0)^2 =R^2
        //in
        float x = 3;
        float y = 4;
        float r = 25;
        float xCenter = 1;
        float yCenter = 1;
        final double PRECISION = 0.00001;
        final byte ON = 0;
        final byte IN = -1;
        final byte OUT = 1;

        byte position;
        //vzdalenost bodu od pocatku
        //float pihagor = (float) Math.sqrt(Math.pow(x-xCenter,2) + Math.pow(y-yCenter,2));
        float pihagor = (float) Math.hypot(x - xCenter, y - yCenter);

        if (Math.abs(pihagor - r) < PRECISION) {
            position = ON;
        } else if (pihagor < r) {
            position = IN;
        } else {
            position = OUT;
        }

        //vypis
        switch (position) {
            case IN:
                System.out.println("Je uvnitr");
                break;
            case ON:
                System.out.println("Je na kruznici");
                break;
            case OUT:
                System.out.println("Je venku");
                break;
            default:
                System.out.println("Tady jsem se nemel nikdy dostat");
        }
    }

}
