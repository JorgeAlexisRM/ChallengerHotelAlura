package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Huespedes;

public class HuespedDAO {
	
	private Connection con;

    public HuespedDAO(Connection con) {
        this.con = con;
    }
    
    public void registrar(Huespedes huesped) {
        try {
            PreparedStatement statement;
                statement = con.prepareStatement(
                        "INSERT INTO huespedes "
                        + "(id, nombre, apellido, fechaNacimiento,nacionalidad,telefono,idReserva)"
                        + " VALUES (?,?, ?, ?, ?,?,?)", Statement.RETURN_GENERATED_KEYS);
    
            try (statement) {
            	statement.setInt(1,huesped.getId());
                statement.setString(2, huesped.getNombre());
                statement.setString(3, huesped.getApellido());
                statement.setString(4, huesped.getFechaNacimiento());
                statement.setString(5, huesped.getNacionalidad());
                statement.setLong(6, huesped.getTelefono());
                statement.setInt(7, huesped.getIdReserva());
    
                statement.execute();
    
                final ResultSet resultSet = statement.getGeneratedKeys();
    
                try (resultSet) {
                    while (resultSet.next()) {
                    	huesped.setId(resultSet.getInt(1));
                        
                        System.out.println(String.format("Se registro el Huesped: %s", huesped));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Huespedes> listar() {
        List<Huespedes> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT id, nombre, apellido, fechaNacimiento,nacionalidad,telefono,idReserva FROM huespedes");
    
            try (statement) {
                statement.execute();
    
                final ResultSet resultSet = statement.getResultSet();
    
                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new Huespedes(
                                resultSet.getInt("id"),
                                resultSet.getString("nombre"),
                                resultSet.getString("apellido"),
                                resultSet.getString("fechaNacimiento"),
                                resultSet.getString("nacionalidad"),
                                resultSet.getLong("telefono"),
                                resultSet.getInt("idReserva")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }

    public int eliminar(int id) {
        try {
            final PreparedStatement statement = con.prepareStatement("DELETE FROM huespedes WHERE ID = ?");

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

    public int modificar(Huespedes huesped) {
        try {
            final PreparedStatement statement = con.prepareStatement(
                    "UPDATE huespedes SET "
                    + " NOMBRE = ?,"
                    + " APELLIDO = ?,"
                    + "FECHANACIMIENTO = ?,"
                    + "NACIONALIDAD = ?,"
                    + "TELEFONO = ?"
                    + " WHERE ID = ?");

            try (statement) {
                statement.setString(1, huesped.getNombre());
                statement.setString(2, huesped.getApellido());
                statement.setString(3, huesped.getFechaNacimiento());
                statement.setString(4, huesped.getNacionalidad());
                statement.setLong(5, huesped.getTelefono());
                statement.setInt(6,huesped.getId());
                statement.execute();

                int updateCount = statement.getUpdateCount();

                return updateCount;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Huespedes> buscar(String apellido) {
        List<Huespedes> resultado = new ArrayList<>();

        try {
            final PreparedStatement statement = con
                    .prepareStatement("SELECT id, nombre, apellido, fechaNacimiento,nacionalidad,telefono,idReserva FROM huespedes WHERE apellido = ?");
    
            try (statement) {
            	statement.setString(1, apellido);
                statement.execute();
    
                final ResultSet resultSet = statement.getResultSet();
    
                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new Huespedes(
                                resultSet.getInt("id"),
                                resultSet.getString("nombre"),
                                resultSet.getString("apellido"),
                                resultSet.getString("fechaNacimiento"),
                                resultSet.getString("nacionalidad"),
                                resultSet.getLong("telefono"),
                                resultSet.getInt("idReserva")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }

}
