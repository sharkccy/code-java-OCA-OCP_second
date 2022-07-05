package ap6;

public class Ap6 {
    public static void main(String[] args) {
       B b = new B();
       b.go();       
    }
}

class A{
    public static void go(){  
        System.out.println("跑跑卡丁車");
    }
}

class B extends A{    
    // public void go(){   錯。父類別的方法宣告成static，若要改寫，宣告要一致
    public static void go(){  //若有static，前就不可再加@Override
        System.out.println("跑跑卡丁車");
    }
}