package ap2;

public class Ap2 {

    public static void main(String[] args) {
        Test t1 = new Test("t1");
        Test t2 = new Test("t2");
        System.out.println("t1狀態：" + t1.isAlive());
        System.out.println("t2狀態：" + t2.isAlive());
        t1.start();
        t2.start();

        t1.setPriority(Thread.MAX_PRIORITY);  // 10最高
        t2.setPriority(Thread.MIN_PRIORITY);  // 1最低

        System.out.println("t1：" + t1.isAlive());
        System.out.println("t2：" + t2.isAlive());

        System.out.println("t1優先權：" + t1.getPriority());  //  預設值 = 5
        System.out.println("t2優先權：" + t2.getPriority());
    }
}

class Test extends Thread { //Thread 類別

    String id;

    public Test(String str) {
        id = str;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            for (long j = 1L; j < 6_000_000_000L; j++);    //空迴圈
            System.out.println(id);
        }
    }

}
