package gmshop.controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
public static void main(String []args){

    // setup connection variables
    String user = "root";
    String pass = "root";

    String jdbcUrl = "jdbc:mysql://localhost:3306/gmshop?useSSL=false&serverTimezone=UTC";
    String driver = "com.mysql.jdbc.Driver";

    // get connection to database
    try {
        System.out.println("Connecting to database: " + jdbcUrl);
        Class.forName("com.mysql.jdbc.Driver");

        Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

        System.out.println("SUCCESS!!!");

        myConn.close();

    }
    catch (Exception exc) {
        exc.printStackTrace();
    }

}

}
