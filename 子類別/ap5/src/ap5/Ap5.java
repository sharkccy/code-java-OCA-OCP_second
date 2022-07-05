package ap5;

public class Ap5 {
    public static void main(String[] args) {
       
    }
}

class M{
    final int no = 1;   // 變數宣告成 final，表示值禁止被修改
    
    public final void go(){ // 方法宣告成 final，表示禁止被改寫
        System.out.println("Go");
    }
}

class N extends M{
    public void set(){
        //    no = 5;               錯
    }

//    public void go(){             錯
//        System.out.println("Go");
//        System.out.println("Go to sleep");
//    }
}
    
final class P{}

// class Q extends P {} 錯