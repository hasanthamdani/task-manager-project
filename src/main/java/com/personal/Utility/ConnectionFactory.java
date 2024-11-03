package com.personal.Utility;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class ConnectionFactory {

    private static final ConnectionFactory connectionFactory = new ConnectionFactory();
    private Properties props = new Properties();
    
    private ConnectionFactory()
    {
        try{
            // Pulls Key:Value pairs from properties file
            props.load(new FileReader("src/main/resources/com/personal/application.properties"));
        }
        catch(IOException e)
        {
            //If property keys or values are mistyped the exception will be caught and displayed
            e.printStackTrace();
        }
    }

    public static ConnectionFactory getConnectionFactory()
    {
        return connectionFactory;
    }

    public Connection getConnection()
    {
        try{
             //Data Source Implementation of get Connection   
             return new DriverManager.getConnection(props.getProperty("url"));
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
