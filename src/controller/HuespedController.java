package controller;

import java.util.List;

import dao.HuespedDAO;
import modelo.Huespedes;

public class HuespedController {
	
private HuespedDAO huespedDAO;
    
    public HuespedController() {
        var conexion = new Conexion();
        this.huespedDAO = new HuespedDAO(conexion.recuperaConexion());
    }

    public void registrar(Huespedes huesped) {
    	huespedDAO.registrar(huesped);
    }
    
    public List<Huespedes> listar() {
        return huespedDAO.listar();
    }
    
    public int modificar(Huespedes huesped) {
        return huespedDAO.modificar(huesped);
    }

    public int eliminar(Integer id) {
        return huespedDAO.eliminar(id);
    }
    
    public List<Huespedes> buscar(String apellido) {
        return huespedDAO.buscar(apellido);
    }
}
