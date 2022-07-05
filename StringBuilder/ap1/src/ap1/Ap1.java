package ap1;

public class Ap1 {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s);
        
        s = "Hello Java";   // s會指向目前宣告"Hello Java的位址"
        System.out.println(s);
        
        StringBuilder sb = new StringBuilder("Java World");
        System.out.println(sb);        
    }
}
