package projecto.lacocinadejuan.dao;

import java.util.ArrayList;

import projecto.lacocinadejuan.domain.Comidas;

public interface ComidasDAO {

    void create(Comidas comida);

    void delete(Integer id);

    void update(Comidas comida);

    ArrayList<Comidas> listarComidas();

}