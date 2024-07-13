package projecto.lacocinadejuan.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import projecto.lacocinadejuan.service.ClientesService;
import projecto.lacocinadejuan.domain.Clientes;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/ListarClientesController")

public class ListarClientesController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        ClientesService service = new ClientesService();

        ArrayList<Clientes> clientes = service.listaDeClientes();

        ObjectMapper mapper = new ObjectMapper();

		String clientesJSON = mapper.writeValueAsString(clientes);
        
        resp.getWriter().println(clientesJSON);
    }

}

