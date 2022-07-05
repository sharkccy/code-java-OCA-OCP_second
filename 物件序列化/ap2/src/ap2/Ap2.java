package ap2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ap2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Std s1 = new Std("Dogy" , "0919-520149" , 26);
        FileOutputStream fo = new FileOutputStream("src/data.txt");
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(s1);     //物件序列化
        oo.close();
        fo.close();
        System.out.println("資料存檔完畢!");
              
        FileInputStream fi = new FileInputStream("src/data.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);
        s1 = (Std) oi.readObject(); //轉回Std類別  //反物件序列化
        oi.close();
        fi.close();
        System.out.println(s1);
    }
}

class Std implements Serializable{       //繼承serializable  才可執行繼承
    String name , tel;
    int age;

    public Std(String name, String tel, int age) {
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    

    @Override
    public String toString() {
        return "name=" + name + ", tel=" + tel + ", age=" + age;
    }
    
}