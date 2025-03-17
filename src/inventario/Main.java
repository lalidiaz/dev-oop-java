package inventario;

public class Main {
    public static void main(String[] args) {
        // Crear un inventario
        Inventario inventario = new Inventario();
        
        // Agregar algunos productos
        inventario.agregarProducto(new Producto("P001", "Laptop HP", 12500.50));
        inventario.agregarProducto(new Producto("P002", "Mouse inalámbrico", 349.99));
        inventario.agregarProducto(new Producto("P003", "Teclado mecánico", 899.90));
        
        // Demostrar búsqueda exitosa
        System.out.println("BÚSQUEDA DE PRODUCTO EXISTENTE:");
        System.out.println("------------------------------");
        try {
            Producto encontrado = inventario.buscarProducto("P001");
            System.out.println("Producto encontrado: " + encontrado);
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Demostrar manejo de excepción con producto que no existe
        System.out.println("\nBÚSQUEDA DE PRODUCTO INEXISTENTE:");
        System.out.println("--------------------------------");
        try {
            Producto noExiste = inventario.buscarProducto("P999");
            System.out.println("Producto encontrado: " + noExiste);
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}