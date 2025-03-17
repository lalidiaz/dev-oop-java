package juego;

public class Main {
    public static void main(String[] args) {
        System.out.println("DEMOSTRACIÓN DEL PATRÓN SINGLETON EN LA CLASE JUEGO");
        System.out.println("===================================================");
        
        System.out.println("\n1. Obteniendo primera instancia del juego:");
        Juego juego1 = Juego.getInstancia();
        juego1.iniciarJuego();
        
        System.out.println("\n2. Intentando obtener una segunda instancia del juego:");
        Juego juego2 = Juego.getInstancia();
        
        System.out.println("\n3. Comprobando si ambas variables apuntan a la misma instancia:");
        boolean mismaDireccionMemoria = (juego1 == juego2);
        System.out.println("juego1 y juego2 son la misma instancia? " + mismaDireccionMemoria);
        
        System.out.println("\nDirección de memoria de juego1: " + System.identityHashCode(juego1));
        System.out.println("Dirección de memoria de juego2: " + System.identityHashCode(juego2));
    }
}