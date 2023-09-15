package com.hoteles.crm.persistance;

import com.hoteles.crm.mapper.input.DisponibilidadRequestDto;
import com.hoteles.crm.mapper.output.DisponibilidadResponseDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DisponibilidadDao {

    private final ConnectionHotel connectionHotel;

    private static final String SP_GET_DISPONIBILIDAD = "{ call sp_Get_Disponibilidad }"

    @Autowired
    public DisponibilidadDao(ConnectionHotel connectionHotel) {
        this.connectionHotel = connectionHotel;
    }

    public List getDisponibilidad(DisponibilidadRequestDto requestDto){



        Connection connection = connectionHotel.getConexion();

        CallableStatement statement = null;

        DisponibilidadResponseDto retornado = null;

        ResultSet resultSet = null;

        try {

            statement = connection.prepareCall(DisponibilidadDao.SP_GET_DISPONIBILIDAD);

            statement.setObject ("@Fecha_Viaje", requestDto.getFechaViaje() );
            statement.setInt (2, requestDto.getIdSede());
            statement.setInt (3, requestDto.getIdTemporada());
            statement.setInt (4, requestDto.getIdTipoHabitacion());
            statement.setInt (5, requestDto.getNumeroPersonas());

            resultSet = statement.executeQuery();

            resultSet.next();

            retornado = new DisponibilidadResponseDto(
//                    statement.getInt("ID"),
//                    statement.getString("NOMBRE"),
//                    null,
//                    statement.getString("CORREO"),
//                    statement.getString("TELÉFONO")

                    resultSet.getInt("ID"),
                    resultSet.getString("NOMBRE"),
                    null,
                    resultSet.getString("CORREO"),
                    resultSet.getString("TELÉFONO")

            );

        }

        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Conexion.close(statement);
            Conexion.close(connection);
        }

        return retornado;

    }

}
