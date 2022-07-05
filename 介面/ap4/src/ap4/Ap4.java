package ap4;

public class Ap4 {
    public static void main(String[] args) {
       
    }
}

interface A{
    public void test();
}

interface B{
    public void run();
}

interface C extends A,B{    // 介面可以繼承多個介面
    
}

class T implements C{
     public void test(){}
     public void run(){}
}

