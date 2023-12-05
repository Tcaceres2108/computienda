
package computienda;

import java.util.Date;


public class compras {
    private int idcompras;
    private int idproducto;
    private Date fecha_compra;
    private int cantidad;
    private double precio;

    public compras(int idcompras, int idproducto, Date fecha_compra, int cantidad, double precio) {
        this.idcompras = idcompras;
        this.idproducto = idproducto;
        this.fecha_compra = fecha_compra;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdcompras() {
        return idcompras;
    }

    public void setIdcompras(int idcompras) {
        this.idcompras = idcompras;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
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
