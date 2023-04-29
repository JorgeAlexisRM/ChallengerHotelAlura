package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class Conexion {

private DataSource dataSource;
    
    public Conexion() {
        var comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotelalura?useTimeZone=true&serverTimeZone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("Vanerd15");
        comboPooledDataSource.setMaxPoolSize(10);
        
        this.dataSource = comboPooledDataSource;
    }

    public Connection recuperaConexion() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
}
