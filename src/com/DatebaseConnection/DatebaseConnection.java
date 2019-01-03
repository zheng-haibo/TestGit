package com.DatebaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatebaseConnection {

    private static final String DBDRIVER="com.mysql.jdbc.Driver";
    private static final String DBURL="jdbc:mysql://localhost:3306/test";
    private static final String DBUSER = "root";
    private static final String PASSWORD = "root";

    private ThreadLocal<Connection> conn = new ThreadLocal<Connection>();

    public Connection getConnection()throws Exception{

        Connection connection = conn.get();

        if(connection == null){
            connection = this.refactorConnection();
            conn.set(connection);
        }

        return connection;
    }

    public Connection refactorConnection()throws Exception{
            Class.forName(DBDRIVER);
            Connection connection = DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
           return connection;
    }

}
