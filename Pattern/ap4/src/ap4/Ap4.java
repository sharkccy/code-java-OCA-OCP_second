package ap4;

public class Ap4 {

    public static void main(String[] args) {
        String s1 = "   Lisa    ";
        String s2 = ",    I  Love You    ";
        System.out.println(s1.trim() + s2.trim());
        System.out.println(s1.trim() + s2.trim().replaceAll("\\s+", " "));
        //trim可刪除前後空白
        //  \\s 表示一個空白， \\s+ 表示多個空白
    }
}
