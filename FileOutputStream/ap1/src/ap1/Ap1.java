package ap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ap1 {
    public static void main(String[] args) {
       try{
            FileInputStream fi = new FileInputStream("src/jade.jpg");
            FileOutputStream fo = new FileOutputStream("src/out.jpg");
            int size = fi.available();  // 讀取圖片的大小。單位是byte            
            byte[] bt = new byte[size];            
            fi.read(bt);
            fi.close();
            fo.write(bt);
            fo.close();
            System.out.println("存檔完成!");
        }
        catch(FileNotFoundException e){
            System.out.println("找不到檔案!");
        }
        catch(IOException e2){
            System.out.println("檔案讀取失敗!");
        }
       
    }
}