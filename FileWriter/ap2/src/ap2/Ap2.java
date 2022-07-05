package ap2;

import java.io.FileWriter;
import java.io.IOException;

public class Ap2 {
    public static void main(String[] args) {
        try{
            FileWriter fw  = new FileWriter("src/paper.txt" , true); // true表示附加
            fw.write("abc\n");
            fw.close();
            System.out.println("存檔成功!!");
        }
       catch(IOException e){
           System.out.println("存檔失敗!!");
       }
       
    }
}
