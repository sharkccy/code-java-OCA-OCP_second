
import java.io.IOException;
import java.net.Socket;

public class client {

    public static void main(String[] args) throws IOException {
        System.out.println("連線至伺服器...");
        Socket s = new Socket("127.0.0.1", 8888);
        s.close();
    }
}
