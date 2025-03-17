package banco;

public class CuentaBancaria {
    protected String numeroCuenta;
    protected String titular;
    protected double saldo;
    
    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    // Métodos para operaciones bancarias
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero.");
        }
    }
    
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
            return true;
        } else {
            System.out.println("No se puede realizar el retiro. Fondos insuficientes o monto inválido.");
            return false;
        }
    }
    
    // Método para calcular intereses
    public double calcularIntereses() {
        // Implementación base
        return 0.0;
    }
}