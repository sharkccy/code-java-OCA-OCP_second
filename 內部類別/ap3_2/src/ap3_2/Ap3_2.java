package ap3_2;

public class Ap3_2 {
    public static void main(String[] args) {
       new T(){};   // 產生一個繼承自類別 T 的內部類別及一個匿名物件
       
       new T(){}.swift();
    }
}

class T{
    public T(){
        System.out.println("T called");
    }
    
    public void swift(){
        System.out.println("swift");
    }
}