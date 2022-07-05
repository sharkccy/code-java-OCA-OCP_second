
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
                   ServerSocket ss = new ServerSocket(9999);
            System.out.println("等待連線...");
            Socket s = ss.accept();
            System.out.println("連線已建立!!");

            // ====== 傳輸資料到client =============================
            OutputStream os = s.getOutputStream();
            String str = "Hello!!";
            os.write(str.getBytes()); // 將字串轉成Byte，再寫入串流中
            os.close();

            // ======================================================
            s.close();     
    }
}