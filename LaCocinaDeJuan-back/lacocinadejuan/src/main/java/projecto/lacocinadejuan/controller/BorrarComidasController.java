package projecto.lacocinadejuan.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import projecto.lacocinadejuan.service.ComidasService;

@WebServlet("/BorrarComidasController")

public class BorrarComidasController extends HttpServlet{

    protected void doDelete(
        HttpServletRequest req, HttpServletResponse resp
    ) throws ServletException, IOException {
       
        String id = req.getParameter("id_cliente");

        ComidasService service = new ComidasService();

        service.borrarComida(Integer.parseInt(id));

        resp.setStatus(HttpServletResponse.SC_OK);
    }

}

