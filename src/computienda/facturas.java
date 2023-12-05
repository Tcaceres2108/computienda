
package computienda;

import java.util.Date;


public class facturas {
    
    private int idfacturas;
    private Date fecha_compra;
    private String nombre_cliente;
    private int idproducto;
    private int cantidad;
    private double precio;
    private double total;

    public facturas(int idfacturas, Date fecha_compra, String nombre_cliente, int idproducto, int cantidad, double precio, double total) {
        this.idfacturas = idfacturas;
        this.fecha_compra = fecha_compra;
        this.nombre_cliente = nombre_cliente;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public int getIdfacturas() {
        return idfacturas;
    }

    public void setIdfacturas(int idfacturas) {
        this.idfacturas = idfacturas;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
    
    
    
    
}
