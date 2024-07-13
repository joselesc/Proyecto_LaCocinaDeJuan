package projecto.lacocinadejuan.controller;

import java.io.IOException;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import projecto.lacocinadejuan.domain.Clientes;
import projecto.lacocinadejuan.service.ClientesService;

@WebServlet("/CrearClientesController")
public class CrearClientesController extends HttpServlet{
    
    @Override
    protected void doPost(
        HttpServletRequest req, HttpServletResponse resp ) 
        throws ServletException, IOException {
       
        String jsonCliente = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

        System.out.println(jsonCliente);
                
        ObjectMapper mapper = new ObjectMapper();
              
        Clientes cliente = mapper.readValue(jsonCliente, Clientes.class);

        ClientesService service = new ClientesService();
        
        service.crearCliente(cliente);
      
        resp.setStatus(HttpServletResponse.SC_CREATED);
    }
}
