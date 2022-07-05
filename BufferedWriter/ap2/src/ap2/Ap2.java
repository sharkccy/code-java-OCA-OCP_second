package ap2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ap2 {
    public static void main(String[] args) throws IOException {       
       BufferedWriter bw = new BufferedWriter(new FileWriter("src/data.txt"));
       bw.write("Hello World");
       bw.newLine();    //換行
       bw.write("Hello everyone");
       bw.flush();      // 將緩衝區的資料寫到記憶體
       bw.close();       
    }
}