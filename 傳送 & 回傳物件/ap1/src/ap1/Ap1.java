package ap1;

public class Ap1 {

    public static void main(String[] args) {
        Car benz = new Car();
        benz.money = 250;
        
        Car honda = new Car();
        honda.money = 90;
        
        benz.cost(honda);
    }
}

class Car {

    int money;

    public void cost(Car c) {       // 呼叫方法時，需傳遞一個屬於類別Car的物件
        if (this.money > c.money) {
            System.out.println("Expensive");    // this指的是呼叫此方法的物件，在這裡是指benz
        }
        else {
            System.out.println("Cheap");
        }
    }
}
