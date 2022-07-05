package ap3;

public class Ap3 {
    public static void main(String[] args) {
       Message m = (str) -> System.out.println("Hello, " + str);
       m.send("Albert");
       
       Message m2 = str -> System.out.println("Hello, " + str);
       m.send("Gary");
    }
}

interface Message{
    public void send(String str);
}