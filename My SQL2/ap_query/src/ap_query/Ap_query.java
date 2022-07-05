package ap_query;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ap_query {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd = "1234";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, passwd);

        if (con != null && !con.isClosed()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入要查詢的會員ID：");
            int id = sc.nextInt();           
            String s = "SELECT * FROM std WHERE id=?";
            PreparedStatement ps = con.prepareStatement(s);           
            ps.setInt(1, id);  
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                System.out.println("Name: " + name);
            }            
        }
    }
}


