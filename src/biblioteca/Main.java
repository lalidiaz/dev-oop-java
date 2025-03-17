package biblioteca;

public class Main {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();
        
        // Agregar algunos libros
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        biblioteca.agregarLibro(new Libro("El Hobbit", "J.R.R. Tolkien"));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell"));
        
        // Ejemplo 1: Préstamo exitoso
        System.out.println("EJEMPLO 1: PRÉSTAMO EXITOSO");
        try {
            biblioteca.prestarLibro("El Hobbit");
        } catch (LibroNoEncontradoException | LibroNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Ejemplo 2: Intentar prestar un libro que ya está prestado
        System.out.println("\nEJEMPLO 2: LIBRO NO DISPONIBLE");
        try {
            biblioteca.prestarLibro("El Hobbit");
        } catch (LibroNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (LibroNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Ejemplo 3: Intentar prestar un libro que no existe
        System.out.println("\nEJEMPLO 3: LIBRO NO ENCONTRADO");
        try {
            biblioteca.prestarLibro("Harry Potter");
        } catch (LibroNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (LibroNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}