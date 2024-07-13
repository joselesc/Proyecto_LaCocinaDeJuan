package projecto.lacocinadejuan.dao;

import java.util.ArrayList;

import projecto.lacocinadejuan.domain.Bebidas;

public interface BebidasDao {

    void create(Bebidas bebida);

    void delete(Integer id);

    void update(Bebidas bebida);

    ArrayList<Bebidas> listarBebidas();

}
