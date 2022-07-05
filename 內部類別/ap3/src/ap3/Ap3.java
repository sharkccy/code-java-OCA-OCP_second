package ap3;

public class Ap3 {
    public static void main(String[] args) {
       T t1 = new T();
       t1.swift();
       
       new T().swift();
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