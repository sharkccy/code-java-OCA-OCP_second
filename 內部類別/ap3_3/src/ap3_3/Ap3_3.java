package ap3_3;

public class Ap3_3 {
    public static void main(String[] args) {
       new T(){};
       
       new T(){
           @Override
           public void swift(){     // 改寫類別 T 的 swift方法
               System.out.println("IOS swift");
           }
       }.swift();
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