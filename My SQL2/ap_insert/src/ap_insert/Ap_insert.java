package ap_insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ap_insert {
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
            System.out.println("請輸入ID: ");
            int id = sc.nextInt();
            System.out.println("請輸入姓名: ");
            String name = sc.next();
            System.out.println("請輸入電話: ");
            String tel = sc.next();
            String s ="INSERT INTO std VALUES(? , ? , ?)";
            PreparedStatement ps = con.prepareStatement(s); //注意前面preparedS
            ps.setInt(1,id);        //1 表第一個? , 後面表要替換成的變數
            ps.setString(2, name);
            ps.setString(3, tel);
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

