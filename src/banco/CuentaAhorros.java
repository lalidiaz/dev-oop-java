package banco;

public class CuentaAhorros extends CuentaBancaria {
    
    public CuentaAhorros(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }
    
    // Sobreescritura del método calcularIntereses
    @Override
    public double calcularIntereses() {
        double tasaInteres = 0.03; // 3%
        return saldo * tasaInteres;
    }
}