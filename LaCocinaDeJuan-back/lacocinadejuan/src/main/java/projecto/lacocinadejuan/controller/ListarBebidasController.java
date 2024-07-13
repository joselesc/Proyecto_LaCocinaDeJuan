package projecto.lacocinadejuan.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import projecto.lacocinadejuan.service.BebidasService;
import projecto.lacocinadejuan.domain.Bebidas;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/ListarBebidasController")

public class ListarBebidasController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BebidasService service = new BebidasService();

        ArrayList<Bebidas> bebidas = service.listaDeBebidas();

        ObjectMapper mapper = new ObjectMapper();

		String bebidasJSON = mapper.writeValueAsString(bebidas);
        
        resp.getWriter().println(bebidasJSON);
    }

}

