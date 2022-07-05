package ap5;

public class Ap5 {

    public static void main(String[] args) {

    }
}

abstract class NB {

    public abstract void compute();
}

interface Bluetooth {

    public void connect();
}

class Mac extends NB implements Bluetooth { // 先繼承類別，再實作介面。順序不可交換

    public void compute() {
    }

    public void connect() {
    }
}
