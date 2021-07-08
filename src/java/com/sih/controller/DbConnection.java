package com.sih.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
    private Connection cnn;
    
    public Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SIHDB","root","");
        return cnn;
    }
}
