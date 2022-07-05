package ap_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ap_update {
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
            System.out.println("請輸入要變更資料的ID: ");
            int id = sc.nextInt();
            System.out.println("請輸入新的名字: ");
            String name = sc.next();
            System.out.println("請輸入新的電話: ");
            String tel = sc.next();
            
            String s ="UPDATE std SET name = ? , tel = ? WHERE id = ?"; 
            PreparedStatement ps = con.prepareStatement(s); 
            ps.setString(1,name);
            ps.setString(2,tel);
            ps.setInt(3,id);
            
            int no = ps.executeUpdate();
            if(no > 0){
                System.out.println("資料變更成功!!");
            }
            else{
                System.out.println("Error!!");
            }
            con.close();
        }
    }
}


