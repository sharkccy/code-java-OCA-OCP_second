package ap1;

public class Ap1 {

    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
    }
}

class Outer {   //外部類別

    int no;

    public void run() {
        System.out.println("run");
    }

    class Inner {   //內部類別

        public void go() {
            System.out.println("go");
        }
    }
}
