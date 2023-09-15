package com.hoteles.crm.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHotel {

    private static final String CONNECTION_STRING = "jdbc:sqlserver://DESKTOP-OF8C0A6;databaseName=Cadena_Hoteles;integratedSecurity=true;";

    private static Connection conexion;

    public static Connection getConexion(){
        try {
            if(ConnectionHotel.conexion == null || conexion.isClosed())
                ConnectionHotel.conexion = DriverManager.getConnection(ConnectionHotel.CONNECTION_STRING);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ConnectionHotel.conexion;
    }

    public static void close(ResultSet resultSet){
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Statement statement){
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(PreparedStatement preparedStatement){
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
