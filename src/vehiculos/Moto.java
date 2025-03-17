package vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;
    
    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + 
               "\nTipo: Moto" +
               "\nCilindrada: " + cilindrada + " cc";
    }
}