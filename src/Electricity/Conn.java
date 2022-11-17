package Electricity;

import java.sql.*;

public class Conn{
    public Statement conn(){
        Connection c;
        Statement s;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","root");
            s = c.createStatement();
           return s;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}