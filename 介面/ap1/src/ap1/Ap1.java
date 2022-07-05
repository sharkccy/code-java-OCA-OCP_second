package ap1;

public class Ap1 {
    public static void main(String[] args) {
       Mobile m = new Mobile();
       m.transfer();
    }
}

interface USB{
    public abstract void transfer();
    //介面內的方法都是抽象的，所以abstract可以省略
}

class Mobile implements USB{
    public void transfer(){
        System.out.println("transfer data");
    }
}