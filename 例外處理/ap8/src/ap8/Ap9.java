package ap8;

import java.util.InputMismatchException;

public class Ap9 {
    public static void main(String[] args) {
       try {
            test(0);
        }
        catch (ArithmeticException e) {
            System.out.println("Error");
        }
    }

    public static void test(int n) throws InputMismatchException {
//        if (n == 0) {                         可有可無
//            throw new ArithmeticException();
//        }
        System.out.println(5 / n);
    }
}
