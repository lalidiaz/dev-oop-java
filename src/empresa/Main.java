package empresa;

public class Main {
    public static void main(String[] args) {
        // Crear una empresa
        Empresa empresa = new Empresa("TechSolutions");
        
        // Crear algunos empleados
        Empleado emp1 = new Empleado("Juan Pérez", "E001", 35000);
        Empleado emp2 = new Empleado("María López", "E002", 42000);
        Empleado emp3 = new Empleado("Carlos Rodríguez", "E003", 30000);
        
        // Agregar empleados a la empresa
        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);
        
        // Listar todos los empleados
        empresa.listarEmpleados();
    }
}