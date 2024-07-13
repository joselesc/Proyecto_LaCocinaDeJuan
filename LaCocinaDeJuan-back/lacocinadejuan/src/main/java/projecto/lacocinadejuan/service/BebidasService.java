package projecto.lacocinadejuan.service;

import java.util.ArrayList;

import projecto.lacocinadejuan.dao.BebidasDAOMysql;
import projecto.lacocinadejuan.dao.BebidasDao;
import projecto.lacocinadejuan.domain.Bebidas;


public class BebidasService {

     private BebidasDao bebidaDAO;
     

   public BebidasService() {
     
      bebidaDAO = new BebidasDAOMysql();
   }

   public void crearBebida(Bebidas bebida){

        this.bebidaDAO.create(bebida);
    }


     public void eliminarBebida(Integer id){

        this.bebidaDAO.delete(id);
     }

     public void updateBebida(Bebidas bebida){

        this.bebidaDAO.update(bebida);

     }

     public ArrayList<Bebidas>listaDeBebidas(){

      return this.bebidaDAO.listarBebidas();
     }
}

