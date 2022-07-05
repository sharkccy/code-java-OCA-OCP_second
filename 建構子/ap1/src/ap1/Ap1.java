package ap1;

public class Ap1 {
    public static void main(String[] args) {
       Moto m1 = new Moto();
       Moto m2 = new Moto("Japan");

       Moto m3;     //只有宣告，沒有產生物件。建構子不會被執行
    }
}

class Moto{
    public Moto(){      //預設建構子
        System.out.println("Go to Hualian");
    }
    
    public Moto(String s){      //建構子
        System.out.println("Go to " + s);        
    }
}

/*
建構子(constructor)
1. 方法名稱與類別名稱相同
2. 不要加 void
3. 產生物件時會自動被呼叫
4. 建構子可以多載
*/
