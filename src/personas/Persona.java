public class Persona {
    // atributos privados
    private String nombre;
    private int edad;
    
    /**
     * @param nombre nombre de la persona
     * @param edad edad de la persona
     */

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * constructor empty
     */

    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
    
    /**
     * getter para nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * setter para nombre
     * 
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * getter para obtener la edad
     * 
     * @return edad 
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * setter para la edad
     * 
     * @param edad nueva edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * mehtod saludar
     */
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
    
    /**
     * 
     * @return representacion con un string
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
}