package projecto.lacocinadejuan.service;

import java.util.ArrayList;

import projecto.lacocinadejuan.dao.ClientesDAOMysql;
import projecto.lacocinadejuan.dao.ClientesDao;
import projecto.lacocinadejuan.domain.Clientes;

public class ClientesService {

    private ClientesDao clienteDAO;

    public ClientesService() {

      clienteDAO = new ClientesDAOMysql();
    }

    public void crearCliente(Clientes cliente){

        this.clienteDAO.create(cliente);
    }

    public void borrarCliente(Integer idCliente){

        this.clienteDAO.delete(idCliente);
    }

    public void updateCliente(Clientes cliente){

        this.clienteDAO.update(cliente);    
    }

    public ArrayList<Clientes> listaDeClientes(){
        
        return this.clienteDAO.listarClientes();
    }
}

