package vehiculos;

public class Main {
    public static void main(String[] args) {
        // Crear instancias
        Coche coche = new Coche("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CBR", 600);
        
        // Mostrar información
        System.out.println("INFORMACIÓN DEL COCHE:");
        System.out.println(coche.mostrarInfo());
        System.out.println();
        
        System.out.println("INFORMACIÓN DE LA MOTO:");
        System.out.println(moto.mostrarInfo());
    }
}