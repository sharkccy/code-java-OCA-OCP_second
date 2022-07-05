package javaapplication_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaApplication_connection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd = "1234";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, passwd);

        if (con != null && !con.isClosed()) {
            System.out.println("資料庫連線成功！");

            // 資料庫連線後要執行的程式碼
            con.close();
        }
    }
}
