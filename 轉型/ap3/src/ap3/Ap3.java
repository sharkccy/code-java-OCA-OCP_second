package ap3;

public class Ap3 {
    public static void main(String[] args) {
       Animal[] m = {new Animal(),new Fish(),new Shark()};
       // 產生一個物件陣列m，內有2個物件向上轉型
       for(int i= 0; i <m.length;i++){
           m[i].sh1();
       }
    }
}

class Animal{
    public void sh1(){
        System.out.println("Animal");
    }    
}

class Fish extends Animal{
    @Override
    public void sh1(){
        System.out.println("Fish");
    }
}

class Shark extends Fish{
    @Override
    public void sh1(){
        System.out.println("Shark");
    }
}