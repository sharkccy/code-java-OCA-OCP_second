package ap2;

public class Ap2 {

    public static void main(String[] args) {
        Std s = new Std("Leo", "台中市", 18);
        System.out.println(s); 
    }
}

class Std {

    String name;
    String address;
    int age;

    public Std(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + ", address: " + this.address ; 
    }

}
