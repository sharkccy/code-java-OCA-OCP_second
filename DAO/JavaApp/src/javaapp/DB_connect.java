package javaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB_connect implements Tool{
        public void insert(Member m){
            try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, "root", "1234");
            String s = "INSERT INTO member VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, m.getId());
            ps.setString(2, m.getName());
            ps.setString(3, m.getPassword());      
            ps.execute();
            con.close();
            System.out.println("資料新增完成!!");
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
