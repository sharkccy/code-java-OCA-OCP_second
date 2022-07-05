package ap2;

public class Ap2 {
    public static void main(String[] args) {
       Inner in = new Inner();  //因為在同類別呼叫，不須再用 Ap2.Inner 呼叫
    }
    static class Inner {   //內部類別。注意宣告成static

        public void go() {
            System.out.println("go");
        }
    }
}
