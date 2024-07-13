package projecto.lacocinadejuan.controller;

import java.io.IOException;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import projecto.lacocinadejuan.domain.Bebidas;
import projecto.lacocinadejuan.service.BebidasService;

@WebServlet("/CrearBebidasController")
public class CrearBebidasController extends HttpServlet{
    
    @Override
    protected void doPost(
        HttpServletRequest req, HttpServletResponse resp ) 
        throws ServletException, IOException {
       
        String jsonCliente = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

        System.out.println(jsonCliente);
        
        ObjectMapper mapper = new ObjectMapper();
              
        Bebidas bebida = mapper.readValue(jsonCliente, Bebidas.class);

        BebidasService service = new BebidasService();
    
        service.crearBebida(bebida);
      
        resp.setStatus(HttpServletResponse.SC_CREATED);
        
    }
}


