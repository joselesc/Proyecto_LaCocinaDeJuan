package projecto.lacocinadejuan.domain;

import java.time.LocalDateTime;

public class Pedidos {

    private Integer idPedido;
    private Integer idCliente;
    private Integer idComida;
    private Integer idBebida;
    private Integer envio;
    private Integer total;
    private LocalDateTime fecha;
    
    public Pedidos() {
    }

    public Pedidos(Integer idPedido, Integer idCliente, Integer idComida, Integer idBebida, Integer total, LocalDateTime fecha) {
       
        this.idCliente=idCliente;
        this.idPedido = idPedido;
        this.idComida = idComida;
        this.idBebida = idBebida;
        this.envio = 2000;
        this.total = total;
        this.fecha = fecha;
    }

    public Pedidos(Integer idCliente, Integer idComida, Integer idBebida, Integer total, LocalDateTime fecha) {
        
        this.idCliente=idCliente;
        this.idComida = idComida;
        this.idBebida = idBebida;
        this.envio = 2000;
        this.total = total;
        this.fecha = fecha;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdComida() {
        return idComida;
    }

    public void setIdComida(Integer idComida) {
        this.idComida = idComida;
    }

    public Integer getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(Integer idBebida) {
        this.idBebida = idBebida;
    }

    public Integer getEnvio() {
        return envio;
    }

    public void setEnvio(Integer envio) {
        this.envio = envio;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pedidos [idPedido=" + idPedido + ", idCliente=" + idCliente + ", idComida=" + idComida + ", idBebida="
                + idBebida + ", envio=" + envio + ", total=" + total + ", fecha=" + fecha + "]";
    }

}