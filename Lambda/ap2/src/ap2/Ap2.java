package ap2;

public class Ap2 {
    public static void main(String[] args) {
       Wifi w  = () -> System.out.println("無線傳輸");      //w為物件名稱，可自訂
       w.transfer();
    }
}
interface Wifi{
    public void transfer();
}