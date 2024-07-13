package projecto.lacocinadejuan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projecto.lacocinadejuan.domain.Comidas;

public class ComidasDAOMysql implements ComidasDAO {

    private Connection con = null;

    @Override
    public void create(Comidas comida) {
       
          String sql = "INSERT INTO comidas( nombre, imagen, descripcion, precio, cantidad) "
                + "VALUES (?, ?, ?, ?, ? )" ;

                  con = AdministradorDeConexiones.conectar();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getImagen());
            ps.setString(3,comida.getDescripcion());
            ps.setInt(4, comida.getPrecio());
            ps.setInt(5, comida.getCantidad());
          

            ps.executeUpdate();

        } catch (SQLException ex) {

            System.err.println(ex.getMessage());

        } finally {
            AdministradorDeConexiones.desconectar(con);
        }
    }

    @Override
    public void delete(Integer id) {
      
        String sql = "DELETE FROM comidas WHERE id_comida= ?";
        try {

            con = AdministradorDeConexiones.conectar();
            
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0)
                System.out.println("La comida con ID=" + id + " ha sido eliminada.");

        } catch (Exception e) {
            e.printStackTrace();
       
        } finally {
            AdministradorDeConexiones.desconectar(con);
        }
    }

    @Override
    public void update(Comidas comida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ArrayList<Comidas> listarComidas() {

       String sql = "select * from comidas";

        ArrayList<Comidas> comidas = new ArrayList<>();

        Connection con = null;

        try{

            con = AdministradorDeConexiones.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Comidas co =new Comidas();

                co.setId(rs.getInt("id_comida"));
                co.setNombre(rs.getString("nombre"));
                co.setImagen(rs.getString("imagen"));
                co.setDescripcion(rs.getString("descripcion"));
                co.setPrecio(rs.getInt("precio"));
                co.setCantidad(rs.getInt("cantidad"));
                co.setDisponible(rs.getBoolean("disponible"));

                comidas.add(co);

            }
        }catch(Exception e){
            System.err.println(e);
        }finally {
            AdministradorDeConexiones.desconectar(con);
        }

        return comidas;
    }

    }

