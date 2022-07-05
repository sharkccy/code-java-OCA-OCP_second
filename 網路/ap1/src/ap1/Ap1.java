package ap1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ap1 {
    public static void main(String[] args) throws UnknownHostException {
       InetAddress ia = InetAddress.getLocalHost();
       System.out.println(ia);
       
       System.out.println(ia.getHostName());
       System.out.println(ia.getHostAddress());
        
    }
}
