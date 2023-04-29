package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Reserva;

public class ReservaDAO {
	
	private Connection con;
	public int id =0;

    public ReservaDAO(Connection con) {
        this.con = con;
    }
    
    public void registrar(Reserva reserva) {
        try {
            PreparedStatement statement;
                statement = con.prepareStatement(
                        "INSERT INTO reservas "
                        + "(id, fechaEntrada, fechaSalida, valor)"
                        + " VALUES (?,?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
    
            try (statement) {
                statement.setInt(1, reserva.getId());
                statement.setString(2, reserva.getFechaEntrada());
                statement.setString(3, reserva.getFechaSalida());
                statement.setString(4, reserva.getValor());
    
                statement.execute();
    
                final ResultSet resultSet = statement.getGeneratedKeys();
    
                try (resultSet) {
                    while (resultSet.next()) {
                    	reserva.setId(resultSet.getInt(1));
                        this.id=reserva.getId();
                        System.out.println(id);
                        System.out.println(String.format("Se ha registrado la reserva: %s", reserva));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Reserva> listar() {
        List<Reserva> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT id, fechaEntrada, fechaSalida, valor FROM reservas");
    
            try (statement) {
                statement.execute();
    
                final ResultSet resultSet = statement.getResultSet();
    
                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new Reserva(
                                resultSet.getInt("id"),
                                resultSet.getString("fechaEntrada"),
                                resultSet.getString("fechaSalida"),
                                resultSet.getString("valor")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
    
    public int eliminar(Integer id) {
        try {
            final PreparedStatement statement = con.prepareStatement("DELETE FROM reservas WHERE ID = ?");

            try (statement) {
                statement.setInt(1, id);
                statement.execute();

                int updateCount = statement.getUpdateCount();

                return updateCount;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int modificar(Reserva reserva) {
        try {
            final PreparedStatement statement = con.prepareStatement(
                    "UPDATE reservas SET "
                    + " FECHAENTRADA = ?,"
                    + " FECHASALIDA = ?,"
                    + " VALOR = ?"
                    + " WHERE ID = ?");

            try (statement) {
                statement.setString(1, reserva.getFechaEntrada());
                statement.setString(2, reserva.getFechaSalida());
                statement.setString(3, reserva.getValor());
                statement.setInt(4, reserva.getId());
                statement.execute();

                int updateCount = statement.getUpdateCount();

                return updateCount;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Reserva> buscar(int id) {
        List<Reserva> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT id, fechaEntrada, fechaSalida, valor FROM reservas WHERE id= ?");
    
            try (statement) {
            	statement.setInt(1, id);
                statement.execute();
    
                final ResultSet resultSet = statement.getResultSet();
    
                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new Reserva(
                                resultSet.getInt("id"),
                                resultSet.getString("fechaEntrada"),
                                resultSet.getString("fechaSalida"),
                                resultSet.getString("valor")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
}
