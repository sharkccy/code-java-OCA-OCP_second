package ap3;

public class Ap3 {

    public static void main(String[] args) {
        Test t = new Test();
        t.go();
        t.go("Hong Kong");
        t.go("Taiwan", "Tachung");
        t.go(1);
    }
}

class Test {

    public void go() {
        System.out.println("Go to");
    }

    public void go(String s1) {
        System.out.println("Go to " + s1);
    }

    public void go(String s1,String s2) {
        System.out.println("Go to " + s1 + " & " + s2);
    }

    public void go(int a) {
        System.out.println("Go Home");
    }

    //public void go(){} 錯
    //public int go(){} 錯

}
/*
多載(Overloading)
方法的名稱相同，但是參數的個數或是型態不同
*/