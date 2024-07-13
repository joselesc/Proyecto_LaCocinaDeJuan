package projecto.lacocinadejuan.controller;

import java.io.IOException;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import projecto.lacocinadejuan.domain.Pedidos;
import projecto.lacocinadejuan.service.PedidosService;

@WebServlet("/CrearPedidosController")
public class CrearPedidosController extends HttpServlet{
    
    @Override
    protected void doPost(
        HttpServletRequest req, HttpServletResponse resp ) 
        throws ServletException, IOException {
       
        String jsonCliente = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

        System.out.println(jsonCliente);
                
        ObjectMapper mapper = new ObjectMapper();
              
        Pedidos pedido = mapper.readValue(jsonCliente, Pedidos.class);

        PedidosService service = new PedidosService();
        
        service.crearPedido(pedido);
      
        resp.setStatus(HttpServletResponse.SC_CREATED);
    }
}