package javaapplication1;
import java.sql.*;
import java.util.Scanner;
public class Simple_insert{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the user name: ");
       String user_name = sc.next();
       System.out.print("enter the password: ");
       String password = sc.next();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employee",
                user_name,
                password
            );

            System.out.println("Connected successfully!");
          /*  System.out.print("enter id: ");
            int id=sc.nextInt();
            System.out.print("enter name: ");
            String name = sc.next();
            System.out.print("enter mail: ");
            String mail = sc.next();*/
String sql = "INSERT INTO back_end (id, name, mail) VALUES ('104','raju','raju@gmail.com')";
     
PreparedStatement ps = con.prepareStatement(sql);
/*ps.setInt(1, id);
ps.setString(2, name);
ps.setString(3,mail);
*/
int rows = ps.executeUpdate();
System.out.println(rows + " record inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
