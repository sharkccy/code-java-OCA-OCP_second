package ap1;

public class Ap1 {

    public static void main(String[] args) {
        star();
        System.out.println("Good Day");
        star();
        pow(6);
        area(3, 9);
    }

    public static void star() {
        System.out.println("********");
    }

    public static void pow(int n) {
        System.out.println(n + "的平方為" + n * n);
    }

    public static void area(int w, int h) {
        System.out.println("面積 = " + (w * h));
    }
}
