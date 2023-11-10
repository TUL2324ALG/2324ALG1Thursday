package assignments03_logic_branching_loops;

public class U33_35Stars {

    public static void main(String[] args) {
        printRectangleOfStars(10, 7);
        printTriangle(5);
        printTriangle2(5);
    }

    /**
     * Print rectangle from stars
     *
     * @param m - height
     * @param n - length
     */
    public static void printRectangleOfStars(int m, int n) {
        for (int radek = 0; radek < m; radek++) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int m) {
        for (int radek = 1; radek <= m; radek++) {
            for (int i = 0; i < radek; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void printTriangle2(int m) {
        for (int radek = 1; radek <= m; radek++) {
            for(int i = 0; i < m - radek; i++){
                System.out.print(" ");
            }
            for (int i = 0; i < radek; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    

}
