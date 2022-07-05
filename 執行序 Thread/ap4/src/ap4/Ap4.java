package ap4;

public class Ap4 {

    public static void main(String[] args) {
        A a = new A();
        a.start();       //透過執行序來執行方法，需呼叫start()
        a.come();
    }
}

class A extends Thread {

    public void run() {
        try {
            sleep(2000);    //單位是毫秒   
        } 
        catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println("go");
    }

    public void come() {
        System.out.println("come");
    }
}
