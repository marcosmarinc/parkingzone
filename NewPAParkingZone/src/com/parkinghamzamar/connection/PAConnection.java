package com.parkinghamzamar.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author ismael
 */
public class PAConnection {

    private Connection connection;
    private final String URL = "jdbc:mysql://localhost:3306/parkinghamzamar";
    private final String PASSWORD = "1234";
    private final String USER = "root";

    
    public Connection getConnection(){
        try{
        connection = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
    public static void main(String[] args) {
        PAConnection pac= new PAConnection();
        
        if(pac.getConnection() != null){
            System.out.println("Conexion exitosa.");
        }
    }
}
