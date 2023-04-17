package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestingDbConnection {
    public static void main(String[] args) {
        /* All the code related to the DB connection
        is included in the try block.
        Java Libraries imported.
         */
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/java35", "root", "T3vaknasir?");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()){
                // Column index in brackets
                System.out.printf("ID %d username:  %s password: %s full name: %s email: %s \n",
                        rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }
            con.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
