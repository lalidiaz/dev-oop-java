package calculadora;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Calculadora
        Calculadora calc = new Calculadora();
        
        // Probar los diferentes métodos sobrecargados
        System.out.println("Suma de dos enteros: " + calc.sumar(5, 3));
        System.out.println("Suma de tres enteros: " + calc.sumar(5, 3, 7));
        System.out.println("Suma de dos decimales: " + calc.sumar(5.5, 3.5));
    }
}