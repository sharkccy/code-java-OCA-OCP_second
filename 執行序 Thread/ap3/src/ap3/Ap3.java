package ap3;

public class Ap3 {
    public static void main(String[] args) {
        A a = new A();
        a.start();       //透過執行序來執行方法，需呼叫start()
        a.come();
    }
}

class T extends Thread {
}

class A extends T {

    public void run() {
        for (long i = 1L; i < 6_000_000_000L; i++);    //空迴圈
        System.out.println("go");
    }

    public void come() {
        System.out.println("come");
    }
}
