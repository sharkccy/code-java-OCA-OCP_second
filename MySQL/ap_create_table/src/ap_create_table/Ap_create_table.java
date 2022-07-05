package ap_create_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ap_create_table {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd = "1234";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, passwd);

        if (con != null && !con.isClosed()) {
            System.out.println("資料庫連線成功！");
            Statement st = con.createStatement();
            String s = "CREATE TABLE std (id INT PRIMARY KEY, name VARCHAR(20))";
            st.execute(s);
            System.out.println("資料表建立完成!");
            con.close();
        }
    }
}
