package empresa;

public class Empleado {
    private String nombre;
    private String id;
    private double salario;
    
    public Empleado(String nombre, String id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
    
    public double getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Salario: $" + salario;
    }
}