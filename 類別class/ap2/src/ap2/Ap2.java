package ap2;

public class Ap2 {

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
