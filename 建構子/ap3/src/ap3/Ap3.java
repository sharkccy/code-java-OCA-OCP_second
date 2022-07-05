package ap3;

public class Ap3 {

    public static void main(String[] args) {
        Car c1 = new Car();
    }
}

class Car {

    public Car() {
        this(5);
        System.out.println("car");        
    }

    public Car(String s) {
        System.out.println("car " + s);
    }

    public Car(int i) {
        System.out.println("car from third");
    }

}
// 在建構子裡面的this表示呼叫Car這個類別的建構子
// this 要放在建構子的第一列
