package projecto.lacocinadejuan.domain;

public class Bebidas {

    private Integer id;
    private String nombre;
    private String imagen;
    private String descripcion;
    private double precio;
    private Integer cantidad;
    private Boolean disponible;
    
    public Bebidas() {
    }

        public Bebidas(Integer id, String nombre, String imagen, String descripcion, double precio, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.disponible = true;
    }
 
    public Bebidas(String nombre, String imagen, String descripcion, double precio, Integer cantidad) {
            this.nombre = nombre;
            this.imagen = imagen;
            this.descripcion = descripcion;
            this.precio = precio;
            this.cantidad = cantidad;
            this.disponible = true;
        }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Bebidas [id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + ", descripcion=" + descripcion
                + ", precio=" + precio + ", cantidad=" + cantidad + ", disponible=" + disponible + "]";
    }

 
}
