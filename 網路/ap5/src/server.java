
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("等待連線中:");
        Socket so = ss.accept();
        System.out.println("連線建立!");

        // ========== 傳輸資料 =================
        String s = "請輸入密碼:";
        OutputStream op = so.getOutputStream();
        op.write(s.getBytes());

        // =====================================    
        InputStream is = so.getInputStream();
        byte data[] = new byte[20];
        int size = is.read(data);
        String pwd = new String(data, 0, size);
        String msg = "";

        if (pwd.equals("123")) {
            msg = "密碼正確!!";
        } else {
            msg = "密碼錯誤!!";
        }

        op.write(msg.getBytes());  //傳送登入結果        

        // ======================================
        op.close();
        is.close();
        ss.close();
    }
}
