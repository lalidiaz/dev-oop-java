package biblioteca;

public class LibroNoEncontradoException extends Exception {
    public LibroNoEncontradoException(String titulo) {
        super("No se encontró ningún libro con título: \"" + titulo + "\"");
    }
}