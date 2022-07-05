
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("等待連線...");
        Socket s = ss.accept();
        System.out.println("接受連線");
        s.close();
        ss.close();
        System.out.println("連線關閉");
    }
}
