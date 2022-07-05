package ap2;

public class Ap2 {

    public static void main(String[] args) {
        String s1 = "student";
        
        System.out.println(s1.substring(2));        // 把s索引2(含)之後的字串切割出來

        System.out.println(s1.substring(2, 6));     // 把s索引2(含)之後的4個字(6-2)切割出來
    }
}
