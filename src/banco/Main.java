package banco;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        CuentaCorriente cuentaCorriente = new CuentaCorriente("CC-123", "Juan Pérez", 1000.0);
        CuentaAhorros cuentaAhorros = new CuentaAhorros("CA-456", "María López", 2000.0);
        
        // Operaciones con cuenta corriente
        System.out.println("OPERACIONES CON CUENTA CORRIENTE:");
        cuentaCorriente.depositar(500.0);
        cuentaCorriente.retirar(200.0);
        System.out.println("Intereses generados: " + cuentaCorriente.calcularIntereses());
        System.out.println();
        
        // Operaciones con cuenta de ahorros
        System.out.println("OPERACIONES CON CUENTA DE AHORROS:");
        cuentaAhorros.depositar(300.0);
        cuentaAhorros.retirar(100.0);
        System.out.println("Intereses generados: " + cuentaAhorros.calcularIntereses());
    }
}