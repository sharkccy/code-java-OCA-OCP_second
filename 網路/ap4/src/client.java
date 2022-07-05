
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class client {

    public static void main(String[] args) throws IOException {
        byte[] data = new byte[20];
        Socket s = new Socket("127.0.0.1", 9999);
        System.out.println("連線成功");

        // ====================================================
        InputStream is = s.getInputStream();
        int n = is.read(data); // 計算讀入資料的大小        
        System.out.println(new String(data, 0, n)); // 印出內容
        is.close();

        // ====================================================
        s.close();
    }
}
