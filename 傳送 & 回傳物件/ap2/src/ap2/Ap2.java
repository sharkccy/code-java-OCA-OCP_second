package ap2;

public class Ap2 {

    public static void main(String[] args) {
        Car benz = new Car();
        benz.money = 250;

        Car honda = new Car();
        honda.money = 90;

        Car tmp = benz.cost(honda);
        System.out.println(tmp.money);
    }
}

class Car {

    int money;

    public Car cost(Car c) {       // 回傳值是一個屬於Car類別的物件
        if (this.money > c.money) {
            return this;
        } 
        else {
            return c;
        }
    }
}
