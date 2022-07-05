package ap6;

public class Ap6 {

    public static void main(String[] args) {
        add();
    }

    public static void add() {
        for (int i = 0;; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                System.out.println();
                return;  //結束程式用
            }
        }
    }
}
