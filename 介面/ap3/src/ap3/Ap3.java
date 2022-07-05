package ap3;

public class Ap3 {

    public static void main(String[] args) {

    }
}

interface USB {

    public abstract void transfer();
}

interface Wifi {

    public abstract void connect();
}

class NB implements USB, Wifi {         // 一個類別可以實作多個介面

    public void transfer() {
        System.out.println("資料傳輸");
    }

    public void connect() {
        System.out.println("無線傳輸");
    }
}
