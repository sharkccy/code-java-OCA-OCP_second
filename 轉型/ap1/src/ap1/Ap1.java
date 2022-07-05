package ap1;

public class Ap1 {

    public static void main(String[] args) {
        M a1 = new N();  // 向上轉型(upcasting)
        System.out.println(a1.getClass());  // a1屬於類別N
        // a1可以執行從父類別繼承或改寫的方法，但是不能執行N類別新增的方法

        a1.run();
        //a1.go();  錯
        
        ((N)a1).go();   // 向下轉型(downcasting)，注意有兩個括號
    }
}

class M {

    public void run() {
        System.out.println("run");
    }
}

class N extends M {

    @Override
    public void run() {      //改寫
        System.out.println("running");
    }
    
    public void go(){
        System.out.println("go");
    }
}
