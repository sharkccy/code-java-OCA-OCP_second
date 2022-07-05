package ap5;

public class Ap5 {
    public static void main(String[] args) {
       
    }
    
    public static int add(int a){        
        return a + 2;// 程式若有執行到return，後方的程式碼就不會執行
        // System.out.println("xx"); 錯，unreachable statement
    }
}
