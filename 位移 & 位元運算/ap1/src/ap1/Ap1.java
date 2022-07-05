package ap1;

public class Ap1 {

    public static void main(String[] args) {
        int n1 = 192;
        System.out.println(n1);

        int n2 = 0B1100_0000;
        System.out.println(n2);

        System.out.println(n1 << 2);    // 左移2個bit，表示 * 2 的平方

        System.out.println(n2 >> 3);    // 右移3個bit，表示除以2的3次方
    }
}
