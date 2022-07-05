package ap1;

public class Ap1 {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {     // 在for迴圈的i++與 ++i相同
            System.out.print(i + "  ");
        }
        System.out.println("");
        for (i = 1; i <= 10; ++i) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (i = 1; i <= 10; i += 2) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (i = 2; i <= 10; i += 2) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
