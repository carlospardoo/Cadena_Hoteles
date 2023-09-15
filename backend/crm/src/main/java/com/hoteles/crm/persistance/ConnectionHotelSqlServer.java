package com.hoteles.crm.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHotelSqlServer implements ConnectionHotel{

    private static final String CONNECTION_STRING = "jdbc:sqlserver://DESKTOP-OF8C0A6;databaseName=Cadena_Hoteles;integratedSecurity=true;";

    private static Connection conexion;

    @Override
    public Connection getConexion(){
        try {
            if(ConnectionHotelSqlServer.conexion == null || conexion.isClosed())
                ConnectionHotelSqlServer.conexion = DriverManager.getConnection(ConnectionHotelSqlServer.CONNECTION_STRING);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ConnectionHotelSqlServer.conexion;
    }

    @Override
    public void close(ResultSet resultSet){
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close(Statement statement){
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close(PreparedStatement preparedStatement){
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
