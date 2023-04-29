package controller;

import java.util.List;

import dao.ReservaDAO;
import modelo.Reserva;

public class ReservaController {

private ReservaDAO reservaDAO;

	public int id =0;
    
    public ReservaController() {
        var conexion = new Conexion();
        this.reservaDAO = new ReservaDAO(conexion.recuperaConexion());
    }

    public void registrar(Reserva reserva) {
    	reservaDAO.registrar(reserva);
    	this.id = reservaDAO.id;
    }
    
    public List<Reserva> listar() {
        return reservaDAO.listar();
    }
    
    public int modificar(Reserva reserva) {
        return reservaDAO.modificar(reserva);
    }

    public int eliminar(Integer id) {
        return reservaDAO.eliminar(id);
    }

    public List<Reserva> buscar(int id){
    	return reservaDAO.buscar(id);
    }
}
