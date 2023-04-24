package finalProject;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java35", "root", "$arezgitaPar0le!");
            System.out.println("Connected to DB!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customers, tools, main");

//            while (rs.next()){
//                // Column index in brackets
//                System.out.printf("category: %s ID %s name %s specifications %s service hours %d price %s",
//                        rs.getString(1), rs.getString(2),
//                        rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
//            }
//            con.close();




        }catch (Exception e){
            System.out.println(e);
        }




    }

}
