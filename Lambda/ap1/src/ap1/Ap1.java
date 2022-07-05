package ap1;

public class Ap1 {
    public static void main(String[] args) {
       Mobile m = new Mobile();
       m.transfer();
    }
}

interface Wifi{
    public void transfer();
}

class Mobile implements Wifi{
    public void transfer(){
        System.out.println("無線傳輸");
    }
}