package JDBC;

import java.sql.*;

/**
 * jdbc
 */
public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        // Class.forName("oracle.jdbc.driver.OracleDriver");
        try{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vps", "root", "dbms");
        Statement stm=con.createStatement();
        String sql="insert into admin values('Nikhil98','pass','Ques','ans','4561237890')";
        stm.executeUpdate(sql);
        System.out.println("Inserted record");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
                
    }
}