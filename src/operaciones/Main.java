package operaciones;

public class Main {
    public static void main(String[] args) {
        // Crear instancias
        Operable suma = new Suma();
        Operable multiplicacion = new Multiplicacion();
        
        // Probar operaciones
        int a = 5;
        int b = 3;
        
        System.out.println("Suma: " + suma.operar(a, b));
        System.out.println("Multiplicación: " + multiplicacion.operar(a, b));
    }
}