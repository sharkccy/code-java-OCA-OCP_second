package ap5;

public class Ap5 {

    public static void main(String[] args) {
        Function f = (n) -> n * n;
        int no = f.pow(3);
        System.out.println(no);
        
        
        System.out.println(f.pow(3));
    }
}

interface Function {

    public int pow(int n);
}
