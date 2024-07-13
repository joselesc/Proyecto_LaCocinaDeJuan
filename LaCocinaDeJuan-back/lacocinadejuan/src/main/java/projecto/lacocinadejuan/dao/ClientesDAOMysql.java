package projecto.lacocinadejuan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projecto.lacocinadejuan.domain.Clientes;

public class ClientesDAOMysql implements ClientesDao {

    private Connection con = null;

    @Override
    public void create(Clientes cliente) {

        String sql = "INSERT INTO Clientes( nombre, apellido, domicilio, telefono,mail, contraseña) "
                + "VALUES (?, ?, ?, ?, ?, ? )";

        con = AdministradorDeConexiones.conectar();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getDomicilio());
            ps.setInt(5, cliente.getTelefono());
            ps.setString(1, cliente.getMail());
            ps.setString(6, cliente.getContraseña());

            ps.executeUpdate();

        } catch (SQLException ex) {

            System.err.println(ex.getMessage());

        } finally {
            AdministradorDeConexiones.desconectar(con);
        }
    }

    @Override
    public void delete(Integer id) {

        String sql = "DELETE FROM clientes WHERE id_cliente = ?";
        try {

            con = AdministradorDeConexiones.conectar();
           
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0)
                System.out.println("El usuario con ID=" + id + " ha sido eliminado.");

        } catch (Exception e) {
            e.printStackTrace();
       
        } finally {
            AdministradorDeConexiones.desconectar(con);
        }
    }

    @Override
    public void update(Clientes cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ArrayList<Clientes> listarClientes() {

       String sql = "select * from clientes";

        ArrayList<Clientes> clientes = new ArrayList<>();

        Connection con = null;
        try{
            con = AdministradorDeConexiones.conectar();

            PreparedStatement  ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

          
            while(rs.next()) {

                Clientes c= new Clientes();

                c.setIdCliente(rs.getInt("id_cliente"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDomicilio(rs.getString("domicilio"));
                c.setTelefono(rs.getInt("telefono"));
                c.setMail(rs.getString("mail"));
               c.setContraseña(rs.getString("contraseña"));
               
                clientes.add(c);
            }
        }catch(Exception e){
            System.err.println(e);
        }finally {
            AdministradorDeConexiones.desconectar(con);
        }

        return clientes;
    }
    
}


