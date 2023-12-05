
package computienda;


public class producto {
    private int idproducto;
    private String nombre_producto;
    private String descripcion;
    private int cantidad;
    private double precio;

    public producto(int idproducto, String nombre_producto, String descripcion, int cantidad, double precio) {
        this.idproducto = idproducto;
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    producto() {
        
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}    

 

