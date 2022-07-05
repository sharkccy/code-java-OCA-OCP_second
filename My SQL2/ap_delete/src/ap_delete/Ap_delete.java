package ap_delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ap_delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd = "1234";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, passwd);
        Scanner sc = new Scanner(System.in);
        if (con != null && !con.isClosed()) {
            System.out.println("資料庫連線成功！");
            System.out.println("請輸入要刪除的ID: ");
            int id = sc.nextInt();
            String s ="DELETE FROM std WHERE id = ?"; //數字不用""
            PreparedStatement ps = con.prepareStatement(s); 
            ps.setInt(1,id);
            int no = ps.executeUpdate();
            if(no > 0){
                System.out.println("資料刪除成功!!");
            }
            else{
                System.out.println("Error!!");
            }
            con.close();
        }
    }
}


