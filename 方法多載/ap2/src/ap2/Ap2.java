package ap2;

public class Ap2 {

    public static void main(String[] args) {

    }

}

class test {

    public test() {
        System.out.println("Test called");
    }
    
    public test(String s) {
        System.out.println("Test" + s);
    }
    
    public void test() {    // 非建構子，是一般方法
        System.out.println("Test");
    }
}
