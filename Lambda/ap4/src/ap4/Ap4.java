package ap4;

public class Ap4 {
    public static void main(String[] args) {
       Function f = (n) -> System.out.println(n * n);
       f.pow(3);
    }
}

interface Function{
    public void pow(int n);
}