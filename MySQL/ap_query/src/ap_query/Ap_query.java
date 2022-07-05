package ap_query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ap_query {

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
            String s = "SELECT* FROM std";
//          String s = "SELECT* FROM std WHERE ID >= 3";
//          String s = "SELECT* FROM std WHERE ID >= 1 AND id <= 2";  //也可用&&
//          String s = "SELECT* FROM std WHERE name LIKE 'S%'"; //%表任何的
//          String s = "SELECT* FROM std WHERE name LIKE 'V%' || tel LIKE '091%'";
            ResultSet rs = st.executeQuery(s);
            while (rs.next()) {
                int i = rs.getInt("id");
                String n = rs.getString("name");
                String n2 = rs.getString("tel");
                System.out.println("id: " + i + "\tname: " + n + "\ttel: " + n2);
            }
            con.close();
        }
    }
}
