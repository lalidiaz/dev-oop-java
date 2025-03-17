package biblioteca;

public class LibroNoDisponibleException extends Exception {
    public LibroNoDisponibleException(String titulo) {
        super("El libro \"" + titulo + "\" no está disponible para préstamo.");
    }
}
