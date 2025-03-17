package inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;
    
    public Inventario() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public Producto buscarProducto(String id) throws ProductoNoEncontradoException {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        
        // Si llegamos aquí, el producto no se encontró
        throw new ProductoNoEncontradoException("No se encontró producto con ID: " + id);
    }
    
    public List<Producto> listarProductos() {
        return new ArrayList<>(productos);
    }
}