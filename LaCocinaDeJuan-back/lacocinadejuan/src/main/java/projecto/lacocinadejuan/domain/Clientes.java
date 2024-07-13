package projecto.lacocinadejuan.domain;

public class Clientes {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String mail;
    private Integer telefono;
    private String contraseña;
   

    public Clientes() {
    }


    public Clientes(Integer idCliente, String nombre, String apellido, String domicilio, String mail, Integer telefono,
            String contraseña) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.mail = mail;
        this.telefono = telefono;
        this.contraseña = contraseña;
    }

    
    public Clientes(String nombre, String apellido, String domicilio, String mail, Integer telefono,String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.mail = mail;
        this.telefono = telefono;
        this.contraseña=contraseña;
    }

  
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;

    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getDomicilio() {
        return domicilio;
    }


    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public String getMail() {
        return mail;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }


    public Integer getTelefono() {
        return telefono;
    }


    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }


    public String getContraseña() {
        return contraseña;
    }


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    @Override
    public String toString() {
        return "Clientes [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio="
                + domicilio + ", mail=" + mail + ", telefono=" + telefono + ", contraseña=" + contraseña + "]";
    }
    
    }

 
