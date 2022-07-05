package ap_query_search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ap_query_search {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/my";
            String user = "root", password = "1234";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            String str = "SELECT my.std.name, my.class.course , my.class.credit , my.major.score FROM my.std , my.class , my.major "
                    + "WHERE my.std.id = my.major.stdid "
                    + "AND my.major.classid = my.class.classid";
            ResultSet rs = st.executeQuery(str);
            while (rs.next()) {
                String n = rs.getString("name");
                int cre = rs.getInt("credit");
                String cor = rs.getString("course");
                String sco = rs.getString("score");
                System.out.println(n + "\t" + cor + "\t" + cre + "\t" + sco + "\t");
            }
            con.close();
        }         
    }

