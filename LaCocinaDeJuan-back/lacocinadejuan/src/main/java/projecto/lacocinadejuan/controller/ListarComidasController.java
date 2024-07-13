package projecto.lacocinadejuan.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import projecto.lacocinadejuan.service.ComidasService;
import projecto.lacocinadejuan.domain.Comidas;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ListarComidasController")
public class ListarComidasController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        ComidasService service = new ComidasService();

        ArrayList<Comidas> comidas = service.ListaDeComidas();

        ObjectMapper mapper = new ObjectMapper();

		String comidasJSON = mapper.writeValueAsString(comidas);
        
        resp.getWriter().println(comidasJSON);
    }

}

