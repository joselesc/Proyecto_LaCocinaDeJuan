package projecto.lacocinadejuan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projecto.lacocinadejuan.domain.Bebidas;


public class BebidasDAOMysql implements BebidasDao{
    
    private Connection con = null;

    @Override
    public void create(Bebidas bebida) {
              
        String sql = "INSERT INTO bebidas( nombre, imagen, descripcion, precio, cantidad) "
                + "VALUES (?, ?, ?, ?, ? )" ;

                  con = AdministradorDeConexiones.conectar();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, bebida.getNombre());
            ps.setString(2, bebida.getImagen());
            ps.setString(3,bebida.getDescripcion());
            ps.setDouble(4, bebida.getPrecio());
            ps.setInt(5, bebida.getCantidad());
          

            ps.executeUpdate();

        } catch (SQLException ex) {

            System.err.println(ex.getMessage());

        } finally {
            AdministradorDeConexiones.desconectar(con);
        }
    }

    @Override
    public void delete(Integer id) {
        
        String sql = "DELETE FROM bebidas WHERE id_bebida = ?";
        try {

            con = AdministradorDeConexiones.conectar();
            
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0)
                System.out.println("La bebida con ID=" + id + " ha sido eliminada.");

        } catch (Exception e) {
            e.printStackTrace();
       
        } finally {
            AdministradorDeConexiones.desconectar(con);
        }
    }

    @Override
    public void update(Bebidas bebida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ArrayList<Bebidas> listarBebidas() {
      
        String sql = "select * from bebidas";

        ArrayList<Bebidas> bebidas = new ArrayList<>();

        Connection con = null;

        try{
            con = AdministradorDeConexiones.conectar();

            PreparedStatement  ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

          
            while(rs.next()) {

                Bebidas b =new Bebidas();

                b.setId(rs.getInt("id_bebida"));
                b.setNombre(rs.getString("nombre"));
                b.setImagen(rs.getString("imagen"));
                b.setDescripcion(rs.getString("descripcion"));
                b.setPrecio(rs.getDouble("precio"));
                b.setCantidad(rs.getInt("cantidad"));
                b.setDisponible(rs.getBoolean("disponible"));

                bebidas.add(b);
            }
        }catch(Exception e){
            System.err.println(e);
        }finally {
            AdministradorDeConexiones.desconectar(con);
        }

        return bebidas;
    }
}
