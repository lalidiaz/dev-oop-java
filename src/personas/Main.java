public class Main {
    public static void main(String[] args) {
        // crear una persona con el constructor que acepta params
        Persona persona1 = new Persona("Ana", 25);
        
        // usar method saludar
        persona1.saludar();
        
        // crear una persona con el constructor empty
        Persona persona2 = new Persona();
        
        // usar los setters para establecer valores
        persona2.setNombre("Carlos");
        persona2.setEdad(30);
        
        // usar los getters para obtener y mostrar los valores
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        
        // Usar el method saludar con la persona modificada
        persona2.saludar();
    }
}