package ap5;

public class Ap5 {
    public static void main(String[] args) {       
        Car c1 = new Car("c1");
        Car c2 = new Car("c2");
        Car c3 = new Car("c3");
        c1.start();        
        try{
            c1.join();  //後方的執行緒要等待c1的執行緒結束才能執行
        }
        catch(InterruptedException e){
            System.out.println("Error");
        }
        c2.start();
        c3.start();
        
    }
}

class Car extends Thread {
    String id;

    Car(String i) {
        id = i;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(600);  // 0.6秒
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(id);
        }
    }
}

