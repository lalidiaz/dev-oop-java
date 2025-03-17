package vehiculos;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    
    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + 
               "\nTipo: Coche" +
               "\nNúmero de puertas: " + numeroPuertas;
    }
}
