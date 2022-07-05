package ap3;

import pkg_A.Car;

public class Ap3 {
    public static void main(String[] args) {
       add(5);
       
       Boat b = new Boat();
       //b.go(); 錯
       
       Car c = new Car();
       // c.go();錯，因為方法 go 沒有宣告成 public
    }
    
    public static void add(int n){
        System.out.println(n + 5);
    }
}

// public: 任何package皆可存取
// private: 同一個class 內可以存取
class Boat{
    private void go(){
        
    }
}