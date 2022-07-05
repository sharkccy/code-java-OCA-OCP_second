package ap6;

public class Ap6 {
    public static void main(String[] args) {
       Function f = (m , n) -> m * n;
        int no = f.pow(3 , 6);
        System.out.println(no);
        
        
        System.out.println(f.pow(3 , 6));
    }
}

interface Function {

    public int pow(int n , int m);
    
    //public void go();         Lambda 語法只試用於介面只有一個方法
}
