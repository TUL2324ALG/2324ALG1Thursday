package assignments05_methods;

/**
 * Knihovni trida
 */
public class VectorTools {
    
    /**
     * Calculates length of a 3D vector starting at origin
     * @param x x-coordinates of a vector
     * @param y y-coordinates of a vector
     * @param z z-coordinates of a vector
     * @return length of the 3D vector 
     */
    public static double calculateDistance(double x, double y, double z){
        double distance = Math.sqrt(x*x + y*y + z*z);
        return distance;
    }
    
    
    
    
    
    
    
    //pro testovaci ucely
    public static void main(String[] args) {        
        System.out.println(VectorTools.calculateDistance(1, 1, 1));
    }
    
}
