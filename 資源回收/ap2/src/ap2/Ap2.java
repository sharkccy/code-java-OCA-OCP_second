package ap2;

public class Ap2 {
    public static void main(String[] args) {
       A a1 = new A();
        A a2 = new A();
        System.out.println("目前有" + A.count + "個物件");

        a2 = null;
        System.out.println("執行資源回收....");
        System.gc();   // 會呼叫 finalize()來執行資源回收

        for (int x = 0; x < 10; x++) // java 本身執行gc的時機不一定，所以加入迴圈來確認何時會執行
        {
            System.out.println("目前有" + A.count + "個物件");
        }
    }
}

class A {

    static int count;

    public A() {
        count++;
    }

    @Override
    protected void finalize() throws Throwable {
        count--;
        System.out.println("呼叫finalize,目前有" + count + "個物件");    // 加入這行來確認finalize是否有被呼叫
    }
}
