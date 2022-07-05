package ap3;

public class Ap3 {
    
    public static void main(String[] args) {
       int a = 3;
       add(a);
        System.out.println("In main , a = " + a);
    }
    
    public static void add(int a){ //此a為區域變數
        a = a + 5;
        System.out.println("In add , a = " + a);
    } 
}
