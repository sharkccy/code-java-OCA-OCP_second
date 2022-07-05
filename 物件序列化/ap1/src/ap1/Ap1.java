package ap1;
/*
資料序列化之目的:
1.可將資料存檔
2.可透過網路傳輸資料(序列化將資料存成2進位檔，才可透過網路線傳送)
*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ap1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       Std s1 = new Std("Dogy" , "0919-520149" , 26);
        FileOutputStream fo = new FileOutputStream("src/data.txt");
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(s1);
        oo.close();
        fo.close();
        System.out.println("資料存檔完畢!");
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