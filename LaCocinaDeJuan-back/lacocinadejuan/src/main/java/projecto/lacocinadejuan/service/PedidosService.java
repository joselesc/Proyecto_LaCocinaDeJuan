package projecto.lacocinadejuan.service;

import java.util.ArrayList;

import projecto.lacocinadejuan.dao.PedidosDAO;
import projecto.lacocinadejuan.dao.PedidosDAOMysql;
import projecto.lacocinadejuan.domain.Pedidos;

public class PedidosService {

    private PedidosDAO pedidoDao;  
    
    
    public PedidosService() {
      
      pedidoDao = new PedidosDAOMysql();
    }

    public void crearPedido(Pedidos pedido){

        this.pedidoDao.create(pedido);
      }

    public void eliminarPedido(Integer id){

        this.pedidoDao.delete(id);
      }

    public void updatePedido(Integer id){

        this.pedidoDao.update(id);
      }

    public ArrayList<Pedidos>listaDePedidos(){

        return this.pedidoDao.listarPedidos();
      }
}
