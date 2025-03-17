package empresa;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public boolean agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        return true;
    }
    
    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados en la empresa.");
            return;
        }
        
        System.out.println("LISTA DE EMPLEADOS DE " + nombre.toUpperCase());
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + ". " + empleados.get(i).toString());
        }
    }
}