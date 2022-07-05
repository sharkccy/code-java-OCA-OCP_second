package ap3;

public class Ap3 {

    public static void main(String[] args) {
        int i = 3;
        for (i = 3; i <= 200; i *= 4) {
            System.out.println(i);
        }
        System.out.println("結束迴圈時，i = " + i);
    }
}
