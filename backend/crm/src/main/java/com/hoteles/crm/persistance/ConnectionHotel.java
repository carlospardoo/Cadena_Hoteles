package com.hoteles.crm.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface ConnectionHotel {

    public Connection getConexion();

    public void close(ResultSet resultSet);

    public void close(Statement statement);

    public void close(PreparedStatement preparedStatement);

    public void close(Connection connection);

}
