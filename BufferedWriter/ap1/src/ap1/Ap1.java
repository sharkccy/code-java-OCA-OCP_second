package ap1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ap1 {
    public static void main(String[] args) throws IOException {
       FileWriter fw = new FileWriter("src/data.txt");
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write("Hello World");
       bw.newLine();    //換行
       bw.write("Hello everyone");
       bw.flush();      // 將緩衝區的資料寫到記憶體
       bw.close();
       fw.close();
    }
}
