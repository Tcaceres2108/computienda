
package computienda;


public class clientes {
    private int idclientes;
    private String nombre_cliente;
    private String direccion;
    private String correo;
    private int telefono;

    public clientes(int idclientes, String nombre_cliente, String direccion, String correo) {
        this.idclientes = idclientes;
        this.nombre_cliente = nombre_cliente;
        this.direccion = direccion;
        this.correo = correo;
    }

    clientes() {
       
    }

    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
}

   

    

  


