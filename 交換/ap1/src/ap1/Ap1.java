package ap1;

public class Ap1 {

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int tmp;

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x = " + x + "     y = " + y);
    }
}
