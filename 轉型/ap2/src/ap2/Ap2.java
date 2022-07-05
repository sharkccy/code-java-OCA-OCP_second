package ap2;

public class Ap2 {
    public static void main(String[] args) {
       A n1 = new B();
       n1.sh1();
       
       A n2 = new C();
       n2.sh1();    //注意此行輸出
       //n2.sh2();錯，不可用B的方法(A沒有的)
       
       B n3 = new C();
       n3.sh1();
       n3.sh2();
       //n3.sh3();錯，不可用自己的方法
    }
}

class A{
    public void sh1(){
        System.out.println("A");
    }
}

class B extends A{
    @Override
    public void sh1(){
        System.out.println("Override A");
    }
    
    public void sh2(){
        System.out.println("B");
    }
}

class C extends B{
    public void sh3(){
        System.out.println("C");
    }
}