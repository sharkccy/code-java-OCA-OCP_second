package ap1;

import java.io.FileWriter;
import java.io.IOException;

public class Ap1 {
    public static void main(String[] args) throws IOException {
       FileWriter fw = new FileWriter("src/data.txt");
       fw.write("Hello World\n");
       fw.write("我愛台灣");
       fw.close();
    }
}
