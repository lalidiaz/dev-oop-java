package juego;

public class Juego {
    // Variable estática para almacenar la única instancia
    private static Juego instancia;
    
    // Constructor privado para evitar la creación de instancias desde fuera
    private Juego() {
        System.out.println("Se ha creado la instancia del juego");
    }
    
    // Método estático que devuelve la única instancia de la clase Juego
    public static Juego getInstancia() {
        if (instancia == null) {
            instancia = new Juego();
        }
        return instancia;
    }
    
    // Método para iniciar el juego
    public void iniciarJuego() {
        System.out.println("El juego ha comenzado!");
    }
}