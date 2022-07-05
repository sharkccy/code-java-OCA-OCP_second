package ap_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ap_update {
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
            String s = "UPDATE std SET name = 'Allen' WHERE id = 05";
            st.execute(s);
            System.out.println("資料修改完成!");
            con.close();
        }
    }
}