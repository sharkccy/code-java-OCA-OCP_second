package ap1;

import pkg_A.Moto;
//impor pkg_A.*;     匯入pkg_A內所有的類別，但是不包含子package
public class Ap1 {
    public static void main(String[] args) {
       Car c1 = new Car();
       c1.go();
       
       pkg_A.Moto m1 = new pkg_A.Moto();
       m1.drive();
       
       Moto m2 = new Moto();
    }
}
