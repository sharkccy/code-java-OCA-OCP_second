package ap6;


public class Ap6 {
    public static void main(String[] args) {
        try {
            divide(0);
        } 
        catch(Exception e){
               System.out.println("分母不可為零!!");
           }
    }
    
    public static void divide(int n) throws ArithmeticException {
        System.out.println(5 / n);
    }
}
