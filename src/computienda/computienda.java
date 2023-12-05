
package computienda;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class computienda {
    public static void main(String[] args) throws SQLException {
        
        System.out.println("INICIANDO.");
        
        try (Connection conexion = establecerConexion()) {
           /* producto producto = new producto();
            
            producto.setIdproducto(14);
            producto.setNombre_producto("Laptop");
            producto.setDescripcion ("Samsung");
            producto.setCantidad (2);
            producto.setPrecio(900000);
            
            insertarproducto(conexion, producto);*/
            
            clientes clientes= new clientes();
            // Crear un nuevo cliente
            clientes.setIdclientes(12);
            clientes.setNombre_cliente("Miryam Perez");
            clientes.setDireccion("Calle 15");
            clientes.setCorreo("miryam@gmail.com");
            clientes.setTelefono(5236741);
            
            // Insertar el cliente en la base de datos
            insertarClientes(conexion, clientes);
        }
          
    }
     private static Connection establecerConexion() throws SQLException {
        // Establecer la conexión a la base de datos (ajusta los detalles según tu base de datos)
        String url = "jdbc:mysql://localhost:3306/computienda";
        String usuario = "root";
        String contraseña = "";

        return DriverManager.getConnection(url, usuario, contraseña);
    }

    /*private static void insertarproducto(Connection conexion, producto producto) throws SQLException {
        String sql = "INSERT INTO producto (idproducto, nombre_producto, descripcion, cantidad, precio) VALUES (?,?,?,?,?)";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, producto.getIdproducto());
            statement.setString(2, producto.getNombre_producto());
            statement.setString(3, producto.getDescripcion());
            statement.setInt(4, (int) producto.getCantidad());
            statement.setDouble(5, producto.getPrecio());
            statement.executeUpdate();
        }
    }*/

    private static void insertarClientes(Connection conexion, clientes clientes) throws SQLException {
        String sql = "INSERT INTO clientes (idclientes, nombre_cliente,direccion, correo , telefono ) VALUES (?,?,?,?,?)";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, clientes.getIdclientes());
            statement.setString(2, clientes.getNombre_cliente());
            statement.setString(3, clientes.getDireccion());
            statement.setString(4, clientes.getCorreo());
            statement.setInt(5, clientes.getTelefono());
            
            
            statement.executeUpdate();
        }
    }
}
    