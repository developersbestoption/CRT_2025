
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
