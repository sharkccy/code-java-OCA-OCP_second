package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {
        Car h = new Honda();  // 向上轉型  
        h.go();
        h.abs();
        ((Honda)h).radar();  // 向下轉型
    }
}

abstract class Car {  // 抽象類別
    public void go() { 
        System.out.println("go");
    }
    
    public abstract void abs();  // 抽象方法
}

class Honda extends Car {       
    @Override
    public void abs(){
        System.out.println("abs system");
    }
    
    public void radar() {
        System.out.println("radar");
    }
}