package edu.sdccd.cisc191.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//v.12.5.0 added MySQLConnection ability so the program can connect to MySQL

public class MySQLConnection {
    public static void main(String[] args) {
        final String DB_URL = "C:\\Users\\Dell\\Downloads\\mysql-connector-java-8.0.27";
        final String USERNAME = "someone";
        final String PASSWORD = "example";

        //identify and define the databse address, username and password to access MySQL

        Connection connect = null;
        Statement state = null;
        //first make it null

        try{
            connect = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connection established");

            state = connect.createStatement();
            String sql = "INSERT INTO users (username, email, phone) " +
                    "VALUES ('Ari', 'baotanaka@hotmail.co.jp', '123-555-4567')";
            state.executeUpdate(sql);
            System.out.println("Records are being transmitted");

        }catch(Exception e){
            e.printStackTrace();
        }
        //try catch connection is used to establish connection. First the address, username and password
        //is used to establish initial
        //connection and then through the username, email and phone the records are being
        //both transmitted to and from the MySQL
        try{
            if(state!=null)
                state.close();
            if(connect!=null)
                connect.close();
            //if the statement and connection in the beginning was not properly set up
            // (aka something wrong with the address, username, password), then close the connection
        }catch(Exception e){
            e.printStackTrace();
        }
        //throwable class to handle exception
    }
}
