package projecto.lacocinadejuan.service;

import java.util.ArrayList;

import projecto.lacocinadejuan.dao.ComidasDAO;
import projecto.lacocinadejuan.dao.ComidasDAOMysql;
import projecto.lacocinadejuan.domain.Comidas;

public class ComidasService {

    private ComidasDAO comidaDao;

public ComidasService() {

        comidaDao = new ComidasDAOMysql();;
    }

public void crearComida(Comidas comida){

      this.comidaDao.create(comida);
  }

  public void borrarComida(Integer id){

      this.comidaDao.delete(id);
  }

  public void updateComida(Comidas comida){

      this.comidaDao.update(comida);    
  }

  public ArrayList<Comidas> ListaDeComidas(){
      
      return this.comidaDao.listarComidas();
  }
}
