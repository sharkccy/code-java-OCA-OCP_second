
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Socket so = new Socket("127.0.0.1", 5000);
        System.out.println("連線成功!!");

        // ==========================================
        InputStream in = so.getInputStream();
        byte data[] = new byte[20];
        int size = in.read(data);
        System.out.println(new String(data, 0, size));

        // ==========================================        
        String pwd = sc.next();
        OutputStream op = so.getOutputStream();
        op.write(pwd.getBytes());

        // ==========================================
        byte data2[] = new byte[20];
        int size2 = in.read(data2);
        System.out.println(new String(data2, 0, size2));

        op.close();
        in.close();
        so.close();
    }
}
