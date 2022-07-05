package ap2;

public class Ap2 {

    public static void main(String[] args) {
        Std s1 = new Std();
        s1.no = 50;
        s1.name = "Nick";
        s1.department = "MIS";
        s1.mail = "nick.gmail.com";

        Teacher t1 = new Teacher(1, "Colt", "IT", "colt@man.com");
    }
}

class Std {

    int no;
    String name;
    String department;
    String mail;
}

class Teacher {

    int no;
    String name;
    String department;
    String mail;

    public Teacher(int no, String name, String department, String mail) {
        this.no = no;
        this.name = name;
        this.department = department;
        this.mail = mail;
    }

}

class Member{
    int id;
    String name;
    double level;

    public Member(int id, String name, double level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }
    
}
