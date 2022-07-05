package ap6;

public class Ap6 {
    public static void main(String[] args) {
       pay p[] = new pay[10];
        for (int i = 0; i < 10; i++) {
            p[i] = new pay();
            p[i].start();
        }
    }
}

class Bank {
    private static int sum = 0;

    public static synchronized void add(int nt) { //synchronized 限制每次只能有一個執行緒呼叫此方法
        sum = sum + nt;
        System.out.println("帳戶總額 = " + sum);
    }
}

class pay extends Thread {
    public void run() {
        Bank.add(100);
    }
}
