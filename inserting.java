
package javaapplication1;
import java.sql.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employee",
                "root",
                "admin"
            );

            System.out.println("Connected successfully!");
String sql = "INSERT INTO back_end (id, name, mail) VALUES (?, ?, ?)";

PreparedStatement ps = con.prepareStatement(sql);
ps.setInt(1, 1);
ps.setString(2, "Amit");
ps.setString(3, "amit@gmail.com");

int rows = ps.executeUpdate();
System.out.println(rows + " record inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
