package projecto.lacocinadejuan.controller;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import projecto.lacocinadejuan.service.PedidosService;
import projecto.lacocinadejuan.domain.Pedidos;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/ListarPedidosControlle")

public class ListarPedidosController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        PedidosService service = new PedidosService();

        ArrayList<Pedidos> comidas = service.listaDePedidos();

        ObjectMapper mapper = new ObjectMapper();

		String comidasJSON = mapper.writeValueAsString(comidas);
        
        resp.getWriter().println(comidasJSON);
    }

}
