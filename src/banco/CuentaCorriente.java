package banco;

public class CuentaCorriente extends CuentaBancaria {
    
    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }
    
    // Sobreescritura del método calcularIntereses
    @Override
    public double calcularIntereses() {
        double tasaInteres = 0.005; // 0.5% 
        return saldo * tasaInteres;
    }
}