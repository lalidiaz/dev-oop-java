package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    
    public Libro buscarLibro(String titulo) throws LibroNoEncontradoException {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        throw new LibroNoEncontradoException(titulo);
    }
    
    public void prestarLibro(String titulo) throws LibroNoEncontradoException, LibroNoDisponibleException {
        Libro libro = buscarLibro(titulo);
        
        if (!libro.isDisponible()) {
            throw new LibroNoDisponibleException(titulo);
        }
        
        libro.prestar();
        System.out.println("Libro \"" + titulo + "\" prestado exitosamente.");
    }
}