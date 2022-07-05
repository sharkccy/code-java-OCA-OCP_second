package ap_insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ap_insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://172.16.3.128:3306/test";
        String user = "root";
        String passwd = "1234";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, passwd);

        if (con != null && !con.isClosed()) {
            System.out.println("資料庫連線成功！");
            Statement st = con.createStatement();
            String s = "INSERT INTO std VALUES(40,'Allen','0987-487487')";
            st.execute(s);
            System.out.println("資料新增完成!");
            con.close();
        }
    }
}