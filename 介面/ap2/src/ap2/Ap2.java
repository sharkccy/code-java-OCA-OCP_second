package ap2;

public class Ap2 {
    public static void main(String[] args) {
       NB n = new NB();
       n.connect();
       n.transfer();
    }
}

interface USB{
    public abstract void transfer();
}

interface TypeC extends USB{        //子介面
    public void connect();            
}

//interface Wifi implements USB{}       錯，介面不可以實作介面


class NB implements TypeC{
    public void transfer(){
        System.out.println("transfer data");
    }
    
    public void connect(){
        System.out.println("正反兩面都可插");
    }
}