package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {
        Honda h = new Honda();
       
    }
}

abstract class Car {  // 抽象類別
    public Car() {  // 預設建構子
        System.out.println("Car");
    }
    
    public abstract void abs();  // 抽象方法
}

class Honda extends Car {
    public Honda() {
        System.out.println("Honda");   
    }
    
    @Override
    public void abs(){
        System.out.println("abs system");
    }
}