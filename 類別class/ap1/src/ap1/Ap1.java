package ap1;

public class Ap1 {

    public static void main(String[] args) {
        Worker w1 = new Worker();   // w1是根據類別Worker所產生的物件(object)
        w1.name = "Eric";
        w1.level = 1;
        w1.info();
        w1.salary(4000);

        Worker w2 = new Worker();
        w2.name = "Amy";
        w2.level = 1.3;
        w2.info();
        w2.salary();
    }
}

class Worker {

    String name;
    double level;
    int day = 22;

    public void info() {
        System.out.println("姓名: " + name + "職等: " + level);
    }

    public void salary() {
        double money = level * day * 1400;
        System.out.println("薪資: " + money);
    }
    
    public void salary(int bonus) {         //方法多載(overloading)
        double money = level * day * 1400;
        System.out.println("薪資: " + (money + bonus));
    }
}
