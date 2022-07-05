package ap6;

public class Ap6 {
    public static void main(String[] args) {
       NFC XR = new Iphone(); //向上轉型
       XR.shift();
       ((Iphone)XR).iMsg();   //向下轉型
    }
}

interface NFC{
    public void shift();
}

class Iphone implements NFC{
    public void shift(){
        System.out.println("點對點資料傳輸");
    }
    public void iMsg(){
        
    }
}