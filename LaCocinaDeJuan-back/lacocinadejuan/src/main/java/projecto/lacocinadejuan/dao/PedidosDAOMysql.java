package projecto.lacocinadejuan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import projecto.lacocinadejuan.domain.Pedidos;

public class PedidosDAOMysql implements PedidosDAO{

    @Override
    public void create(Pedidos pedido) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void update(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ArrayList<Pedidos> listarPedidos() {
       
          String sql = "select * from pedidos";

        ArrayList<Pedidos> pedidos = new ArrayList<>();

        Connection con = null;

        try{
            con = AdministradorDeConexiones.conectar();

            PreparedStatement  ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

          
            while(rs.next()) {

                Pedidos p =new Pedidos();

               p.setIdPedido(rs.getInt("id_pedido"));
               p.setIdCliente(rs.getInt("id_cliente"));
               p.setIdComida(rs.getInt("id_comida"));
               p.setIdBebida(rs.getInt("id_bebida"));
               p.setEnvio(rs.getInt("envio"));
               p.setTotal(rs.getInt("total"));
              
               pedidos.add(p);
            }
        }catch(Exception e){
            System.err.println(e);
        }finally {
            AdministradorDeConexiones.desconectar(con);
        }

        return pedidos;
    }
    
}


