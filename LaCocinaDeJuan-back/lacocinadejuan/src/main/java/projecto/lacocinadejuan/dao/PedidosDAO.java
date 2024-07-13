package projecto.lacocinadejuan.dao;

import java.util.ArrayList;

import projecto.lacocinadejuan.domain.Pedidos;

public interface PedidosDAO {

    void create(Pedidos pedido);

    void delete(Integer id);

    void update(Integer id);

    ArrayList<Pedidos> listarPedidos();

}


