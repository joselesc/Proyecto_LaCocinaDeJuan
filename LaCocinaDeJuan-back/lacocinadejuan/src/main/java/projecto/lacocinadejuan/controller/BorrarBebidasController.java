package projecto.lacocinadejuan.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import projecto.lacocinadejuan.service.BebidasService;

@WebServlet("/BorrarBebidasController")
public class BorrarBebidasController extends HttpServlet{

    protected void doDelete(
        HttpServletRequest req, HttpServletResponse resp
    ) throws ServletException, IOException {
       
        String id = req.getParameter("id_cliente");

        BebidasService service = new BebidasService();

        service.eliminarBebida(Integer.parseInt(id));

        resp.setStatus(HttpServletResponse.SC_OK);
    }

}
