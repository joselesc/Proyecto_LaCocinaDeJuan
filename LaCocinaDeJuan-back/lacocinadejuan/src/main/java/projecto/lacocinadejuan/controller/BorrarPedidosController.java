package projecto.lacocinadejuan.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import projecto.lacocinadejuan.service.PedidosService;

@WebServlet("/BorrarPedidosController")

public class BorrarPedidosController extends HttpServlet{

    protected void doDelete(
        HttpServletRequest req, HttpServletResponse resp
    ) throws ServletException, IOException {
       
        String id = req.getParameter("id_cliente");

        PedidosService service = new PedidosService();

        service.eliminarPedido(Integer.parseInt(id));

        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
