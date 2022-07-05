package ap4;

public class Ap4 {

    public static void main(String[] args) {
        M m1 = new M();
        System.out.println(m1.no);
        
        M m2 = new M();
        m2.no = 8;
        System.out.println(m2.no);
        
        m2 = m1;                    //m2參照到m1
        System.out.println(m2.no);      
        m2.no = 10;
        System.out.println(m1.no);
    }
}

class M {    
    int no = 5;
    
}
