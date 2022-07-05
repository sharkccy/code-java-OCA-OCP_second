package ap6;

public class Ap6 {
    public static void main(String[] args) {
       Animal a1 = new Animal();
       
       Dog d1 = new Dog();
    }
}

class Animal{
    public Animal(){                //預設建構子
        System.out.println("Animal");
    }
}

class Dog extends Animal{           // 會先呼叫父類別的預設建構子，再呼叫本身的建構子
    public Dog(){
        System.out.println("Dog");
    }
}