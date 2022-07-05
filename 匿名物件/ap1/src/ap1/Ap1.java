package ap1;

public class Ap1 {
    public static void main(String[] args) {
       M m1 = new M();
       new M(); //產生一個匿名物件
       
       new M("Taiwan");
       
       new M().play();
    }
}

class M{
    public M(){
        System.out.println("Hello");
    }
    
    public M(String s){
        System.out.println("Hello " + s);
    }
    
    public void play(){
        System.out.println("Play Games");
    }
       
}
