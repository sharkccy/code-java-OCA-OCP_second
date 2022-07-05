package ap1;

public class Ap1 {

    public static void main(String[] args) {
        //Car c = new Car(); 抽象類別不能產生物件
        Honda h = new Honda();
        h.go();
        h.abs();
    }
}

abstract class Car { //抽象類別
    public Car(){                   //預設建構子
        System.out.println("Car");
    }
    public void go() {
        System.out.println("go");
    }

    public abstract void abs();     //抽象方法，沒有body
}

class Honda extends Car {       //必須改寫繼承之抽象方法，不然會錯

    public Honda() {
        System.out.println("Honda");
    }

    @Override
    public void abs() {
        System.out.println("abs system");
    }
}
