package ap4;

public class Ap4 {

    public static void main(String[] args) {
        double m = max(5, 6);
        System.out.println(m);
        
        System.out.println(max(9.658 * 0.87 , 9.65482 * 0.99));
    }

    public static double max(double a, double b) {
        double m;
        m = a > b ? a : b;
        return m;
    }
}
