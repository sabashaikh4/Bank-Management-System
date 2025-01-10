package bank.management.system;

import java.sql.*;

public class Connectionn {
    Connection connection;
    Statement statement;
    public Connectionn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","200410");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}