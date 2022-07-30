package javaassignment;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;


/**
 *
 * @author  
 */
public class JavaAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
{
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_stud","root","")) {
                Statement stmt=(Statement) con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from db_tab");
                while(rs.next())
                {
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                }
            }
        }
    catch(Exception e)
{
       System.out.println(e);
    }
    }
   
    }
    
