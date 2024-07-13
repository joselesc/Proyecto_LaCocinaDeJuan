package projecto.lacocinadejuan.dao;

import java.util.ArrayList;

import projecto.lacocinadejuan.domain.Clientes;

public interface ClientesDao {

    public void create(Clientes cliente);

    public void delete(Integer id);

    public void update(Clientes cliente);

    public ArrayList<Clientes> listarClientes();
}

