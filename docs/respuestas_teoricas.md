## Preguntas Teóricas
1. **Definición y Principios:**
   ¿Qué es la Programación Orientada a Objetos (POO) y cuáles son sus cuatro pilares fundamentales? Nota: Menciona conceptos como encapsulación, abstracción, herencia y polimorfismo.

La Programación Orientada a Objetos (POO) es un paradigma de programación que utiliza 'objetos' como base fundamental. Estos objetos contienen información en forma de  atributos, propiedades o variables y código en forma de métodos (funciones).
Los cuatro pilares fundamentales de la POO son:

-  _**Encapsulación**_: Es el mecanismo que permite ocultar los detalles internos de un objeto y solo exponer lo necesario. Protege la integridad de los datos al restringir el acceso directo a ellos mediante modificadores de acceso (público, privado, protegido).
-  _**Abstracción**_: Consiste en identificar las características y comportamientos esenciales de un objeto y descartar los detalles irrelevantes. Permite representar conceptos complejos de manera simplificada.
-  _**Herencia**_: Es el mecanismo por el cual una clase (llamada clase hija o subclase) puede heredar atributos y métodos de otra clase (llamada clase padre o superclase). Facilita la reutilización de código y establece relaciones jerárquicas entre clases.
-  _**Polimorfismo**_: Permite que objetos de diferentes clases respondan de manera distinta al mismo mensaje o método. Esto significa que un mismo método puede comportarse de forma diferente según la clase que lo implemente, proporcionando flexibilidad al código.

Estos cuatro pilares permiten crear programas más organizados, flexibles y fáciles de mantener, facilitando la reutilización de código y la solución de problemas complejos.

------------------------------------------------------------------

2.  **Encapsulación:**
   Explica el concepto de encapsulación y cómo se implementa en Java. ¿Qué ventajas ofrece a la hora de diseñar aplicaciones?

En la programación orientada a objetos (POO), la encapsulación se refiere a la agrupación de datos con los métodos que operan en esos datos, o la restricción del acceso directo a algunos de los componentes de un objeto. La encapsulación se utiliza para ocultar los valores o el estado de un objeto de datos estructurados dentro de una clase, evitando el acceso directo a ellos por parte de los clientes de una manera que podría exponer detalles de Implementación ocultos o violar la invariancia de estado mantenida por los métodos. 

Podríamos decir por tanto que con la encapsulación logramos agrupar datos o restringir el acceso directo a algunos componentes de un objeto, mediante métodos a modo de intermediarios que harán uso de ellos mediante unas reglas definidas.

Este principio nos permite crear una especie de barrera protectora alrededor de nuestros datos, asegurando su integridad y facilitando su manipulación.

La encapsulación en Java es un principio fundamental de la POO que consiste en agrupar los datos (atributos) y los métodos (comportamientos) relacionados con un objeto dentro de una sola unidad, llamada clase. Además, se controla el acceso a estos datos y métodos, permitiendo únicamente interacciones controladas desde el exterior de la clase.

La encapsulación permite ocultar la complejidad interna de una clase, proporcionando una interfaz controlada para interactuar con los objetos de esa clase. Esto mejora la seguridad y la integridad de los datos, ya que solo se pueden modificar a través de métodos específicos de la clase, permitiendo así una validación adecuada antes de realizar cualquier cambio.

Un ejemplo común de encapsulación en Java es tener atributos privados y proporcionar métodos públicos de acceso, conocidos como “getters” y “setters”, para leer y modificar esos atributos de forma controlada. Este enfoque garantiza que el acceso a los datos sea a través de métodos que puedan aplicar validaciones o lógica adicional antes de realizar cualquier modificación.

Para lograr la encapsulación en Java, se utilizan modificadores de acceso, como “public”, “private” y “protected”, para determinar qué partes del código pueden acceder y modificar los atributos y métodos de una clase.

- Public: Los miembros (atributos y métodos) marcados como públicos son accesibles desde cualquier parte del programa. No existen restricciónes en su acceso.
- Private: Los miembros marcados como privados solo son accesibles dentro de la misma clase. Otros objetos o clases no pueden acceder directamente a ellos.
- Protected: Los miembros marcados como protegidos son accesibles dentro del mismo paquete y también por clases derivadas (herencia) fuera del paquete.

A través del encapsulamiento, se puede lograr la inmutabilidad de ciertos atributos de una clase. Al marcar un atributo como privado y proporcionar solo un método de lectura (getter), se evita que dicho atributo sea modificado accidental o intencionalmente desde fuera de la clase.

Por otro lado, el encapsulamiento mejora la integridad y validación de datos, ya que los métodos “setters” pueden incluir lógica de validación para asegurar que los datos ingresados cumplan ciertos criterios. Esto garantiza la integridad de los datos almacenados en los atributos de la clase.

El encapsulamiento en Java ofrece una serie de beneficios que son fundamentales para el desarrollo de software de calidad. Entre ellos podemos destacar los siguientes:

- _Seguridad de datos_: Al marcar los atributos como privados, se protegen de accesos no autorizados desde fuera de la clase. Esto evita que los datos se corrompan o modifiquen de manera inesperada, mejorando la seguridad y la integridad del programa.
- _Control de acceso_: Java permite establecer niveles de acceso a los miembros de una clase, como public, private y protected. Esto controla quién puede acceder a los atributos y métodos de la clase, permitiendo un acceso controlado y seguro.
- _Abstracción_: La encapsulación permite ocultar los detalles de implementación de una clase y proporcionar una interfaz pública clara y coherente. Esto facilita la interacción con la clase y reduce la complejidad para otros desarrolladores que utilizan la clase.
- _Flexibilidad_: A través de los métodos “setters” y “getters”, puedes agregar lógica personalizada para validar y transformar los datos antes de su acceso o modificación. Esto brinda flexibilidad para adaptar y modificar la clase sin afectar a otros componentes del programa.
- _Mantenibilidad_: El encapsulamiento mejora la mantenibilidad del código al permitir cambios internos en la clase sin afectar a las partes que interactúan con ella. Esto facilita las actualizaciones y correcciones de errores sin riesgo de efectos secundarios no deseados.
- _Reutilización de código_: Las clases encapsuladas se pueden utilizar en diferentes partes de una aplicación o incluso en proyectos diferentes. Esto fomenta la reutilización de código, ya que una vez que se ha creado una clase bien encapsulada, es fácil de integrar en otros contextos.

------------------------------------------------------------------

3. **Herencia y Polimorfismo:**
Describe la relación entre herencia y polimorfismo. ¿Cómo permite la herencia reutilizar código y qué rol juega el polimorfismo en la extensión de comportamientos?

La herencia, en términos simples, es como construir a partir de cimientos ya existentes. Sigue un principio similar, permitiéndote definir nuevas clases basadas en clases previamente existentes, aprovechando y extendiendo su funcionalidad. Así, podes ahorrar tiempo y esfuerzo al reutilizar código ya probado y adaptarlo a tus necesidades, proporcionando una base sólida para tu programa.

El polimorfismo es la capacidad de un objeto para adquirir múltiples formas o comportamientos, es la habilidad de una clase para implementar métodos con el mismo nombre pero con comportamientos distintos, dependiendo de la clase específica con la que se esté interactuando. Esto añade flexibilidad y extensibilidad a tu código, permitiendo adaptarse a diferentes situaciones y requerimientos.

En Java, la herencia se implementa utilizando la palabra clave _extends_. 

El polimorfismo permite que los objetos de diferentes clases respondan a un mismo mensaje de manera específica para cada uno. En Java, el polimorfismo se logra mediante el uso de herencia y la implementación de interfaces.

Supongamos que estamos creando un programa para modelar diferentes tipos de vehículos. Podemos tener una clase base Vehiculo`y luego crear clases derivadas como Coche y Bicicleta.

```
class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Coche extends Vehiculo {
    public void mover() {
        System.out.println("El coche se está desplazando por la carretera.");
    }
}

class Bicicleta extends Vehiculo {
    public void mover() {
        System.out.println("La bicicleta se está pedaleando en el carril.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Coche();
        miVehiculo.mover();  // Llama al método de Coche

        miVehiculo = new Bicicleta();
        miVehiculo.mover();  // Llama al método de Bicicleta
    }
}
```

Siguiendo con el ejemplo anterior, ahora vamos a aplicar polimorfismo para mostrar cómo diferentes vehículos pueden responder al mismo mensaje de manera específica.

```
public class Main {
    public static void main(String[] args) {
        Vehiculo[] misVehiculos = new Vehiculo[2];
        misVehiculos[0] = new Coche();
        misVehiculos[1] = new Bicicleta();

        for (Vehiculo vehiculo : misVehiculos) {
            vehiculo.mover();
        }
    }
}
```

El ejemplo  demuestra cómo la herencia permite la reutilización de la estructura de código (todos heredan de Vehiculo), mientras que el polimorfismo permite la especialización del comportamiento (cada uno implementa su propio método mover()).

------------------------------------------------------------------

4. **Abstracción:** ¿Qué es la abstracción en el contexto de la POO? Explica cómo se puede lograr en Java mediante clases abstractas e interfaces.

La abstracción en Java es un concepto fundamental de la POO que se centra en ocultar los complejos detalles de implementación y mostrar sólo las características esenciales de un objeto. Ayuda a reducir la complejidad y el esfuerzo de programación al proporcionar una separación clara entre las propiedades abstractas y los detalles de implementación. La abstracción permite a los desarrolladores trabajar con sistemas complejos simplificando las interacciones con ellos. Al definir interfaces comunes, la abstracción fomenta la reutilización del código en diferentes implementaciones. Oculta los detalles internos de implementación, protegiendo así el código de accesos y modificaciones no autorizados.

Java proporciona abstracción mediante clases abstractas e interfaces.

Una clase abstracta en Java es una clase que no puede instanciarse por sí misma y que puede contener métodos abstractos (métodos sin cuerpo) que deben ser implementados por sus subclases.

```
// Clase abstracta Animal
abstract class Animal {
    // Atributo común a todos los animales
    protected String nombre;
    
    // Constructor 
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    // Método concreto que heredarán todas las subclases
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
    
    // Método abstracto que deberán implementar todas las subclases
    public abstract void hacerSonido();
}

// Clase concreta que hereda de Animal
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    
    // Implementación del método abstracto
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: Guau guau!");
    }
}

// Clase concreta que hereda de Animal
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }
    
    // Implementación del método abstracto
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: Miau miau!");
    }
}
```

Una interfaz en Java es un tipo de referencia que puede contener métodos abstractos y constantes estáticas. Las clases que implementan una interfaz deben proporcionar implementaciones para todos sus métodos.

```
// Interfaz Domesticable
interface Domesticable {
    // Métodos que deben implementar las clases
    void acariciar();
    void entrenar();
    boolean esAmigable();
}

// Clase Perro que extiende de Animal e implementa Domesticable
class Perro extends Animal implements Domesticable {
    private boolean entrenado;
    
    public Perro(String nombre) {
        super(nombre);
        this.entrenado = false;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: Guau guau!");
    }
    
    @Override
    public void acariciar() {
        System.out.println(nombre + " mueve la cola cuando lo acarician.");
    }
    
    @Override
    public void entrenar() {
        System.out.println(nombre + " está siendo entrenado.");
        this.entrenado = true;
    }
    
    @Override
    public boolean esAmigable() {
        return true;
    }
}

// Clase Lobo que extiende de Animal pero NO implementa Domesticable
class Lobo extends Animal {
    public Lobo(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: Auuuuuuuu!");
    }
}
```

La diferencia principal entre clases abstractas e interfaces es que las clases abstractas pueden tener tanto métodos abstractos como implementados, mientras que las interfaces solo pueden tener métodos abstractos. Además, una clase puede implementar múltiples interfaces, pero solo puede extender una clase abstracta, lo que refleja la diferencia entre 'es un' (herencia) y 'puede hacer' (implementación).


------------------------------------------------------------------

5. **Constructores**: ¿Cuál es el propósito de un constructor en una clase Java? Menciona la diferencia entre un constructor por defecto y un constructor parametrizado.

En Java, un constructor es un método especial utilizado para inicializar objetos. A diferencia de los métodos normales, los constructores se invocan cuando se crea una instancia de una clase. Tienen el mismo nombre que la clase y no tienen tipo de retorno. Los constructores son esenciales para establecer los valores iniciales de los atributos del objeto y prepararlo para su uso.

El constructor por defecto (si no se definen constructores explícitamente en la clase), inicializa el objeto con valores por defecto. 

```
public class Coche {
    String modelo;
    int año;

    // Constructor por defecto
    public Coche() {
        modelo = "Desconocido";
        año = 0;
    }

    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println("Modelo: " + coche.modelo + ", Año: " + coche.año);
    }
}
```
Un constructor parametrizado acepta argumentos para inicializar un objeto con valores específicos. Esto permite una inicialización más flexible y controlada de los atributos de los objetos.

```
public class Coche {
    String modelo;
    int año;
    
    // Constructor parametrizado
    public Coche(String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
    }
    
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", 2021);
        System.out.println("Modelo: " + coche.modelo + ", Año: " + coche.año);
    }
}
```

------------------------------------------------------------------

6. **Interfaces**: Define qué es una interfaz en Java y explica en qué se diferencia de una clase abstracta. ¿Cuándo es preferible utilizar una interfaz?

Una interfaz en Java es un tipo de referencia similar a una clase que contiene únicamente constantes, firmas de métodos, métodos default, métodos estáticos y tipos anidados. Las interfaces actúan como un contrato que las clases deben implementar.

Características principales de las interfaces:

- Todos los métodos declarados son implícitamente public y abstract (excepto métodos default y estáticos)
- Todos los campos son implícitamente public, static y final (constantes)
- Desde Java 8, pueden contener métodos default (con implementación)
- Permiten herencia múltiple (una clase puede implementar varias interfaces)

Ejemplo de interfaz:

```
public interface Vehiculo {
    String MARCA = "Genérica"; // Constante (implícitamente public static final)
    float MAX_VEL = 120.0f;    // Constante
    
    void arrancar();           // Método abstracto
    void detener();            // Método abstracto
    
    default void claxon() {    // Método default (desde Java 8)
        System.out.println("Sonando claxon");
    }
}
```

Diferencias con las clases abstractas:

- Una clase abstracta puede tener constructores, una interfaz no.
- Las clases abstractas pueden tener campos no finales, las interfaces solo constantes.
- Las clases abstractas pueden tener métodos con implementación sin necesidad de marcarlos como 'default'.
- Una clase puede extender solo una clase abstracta, pero puede implementar múltiples interfaces.
- Las clases abstractas pueden tener modificadores de acceso en sus miembros; en las interfaces son siempre públicos.

Se prefiere usar interfaces cuando:

✅ Se necesita herencia múltiple.

✅ Se quiere definir un contrato sin forzar una jerarquía de herencia.

✅ Se necesita que clases no relacionadas implementen un mismo comportamiento.

✅ Se quiere especificar el comportamiento de un tipo particular sin preocuparse por quién lo implementa.

------------------------------------------------------------------


7. **Sobrecarga vs. Sobreescritura**: Explica la diferencia entre sobrecarga (overloading) y sobreescritura (overriding) de métodos. ¿Qué ventajas ofrece cada uno en el diseño de clases?

En Java, dos o más métodos pueden tener el mismo nombre si difieren en sus parámetros (diferente número de parámetros, diferentes tipos de parámetros, o ambos). Estos métodos se llaman métodos sobrecargados y esta característica se llama sobrecarga de métodos. Por ejemplo:

```
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```

Aquí, el método myMethod() está sobrecargado. Estos métodos tienen el mismo nombre pero aceptan diferentes argumentos.

_Ejemplo_

```
class MethodOverloading {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
}
```

En lugar de definir dos métodos que deberían hacer lo mismo, es mejor sobrecargar uno.

En cuanto a la sobreescritura, sabemos que la herencia es una propiedad de la POO que nos permite derivar una nueva clase (subclase) a partir de una clase existente (superclase). La subclase hereda los atributos y métodos de la superclase.

Ahora, si el mismo método está definido tanto en la superclase como en la subclase, entonces el método de la subclase anula el método de la superclase. Esto se conoce como sobrescritura de métodos.

```
class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   @Override
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}

class Main {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
   }
}
```

_Ventajas de la sobrecarga (overloading):_

- Mayor flexibilidad: Permite usar el mismo nombre de método para operaciones similares pero con diferentes tipos o número de parámetros.
- Mejor legibilidad del código: Hace que el código sea más intuitivo al usar nombres significativos para operaciones relacionadas.
- Simplificación de la API: Reduce la cantidad de nombres de métodos que los usuarios necesitan recordar.

_Ventajas de la sobreescritura (overriding):_

- Polimorfismo: Permite que las subclases proporcionen implementaciones específicas de métodos heredados.
- Extensibilidad: Facilita extender la funcionalidad de las clases existentes sin modificarlas (principio Open/Closed).
- Especialización de comportamiento: Permite que las subclases adapten comportamientos generales a sus necesidades específicas.


------------------------------------------------------------------

8. **Palabras clave "this" y "super"**: ¿Qué significan y para qué se utilizan las palabras clave this y super en Java? Proporciona ejemplos de situaciones en las que se usan.

La palabra clave `this` se refiere al objeto actual en un método o constructor.

El uso más común de la palabra clave `this` es para eliminar la confusión entre los atributos de clase y los parámetros con el mismo nombre (porque un atributo de clase queda oculto por un parámetro de método o constructor). Si omites esta palabra clave en el ejemplo anterior, el resultado sería "0" en lugar de "5". 

`this` también puede usarse para:

- Invocar el constructor de la clase actual
- Invocar el método de la clase actual
- Devolver el objeto de la clase actual
- Pasar un argumento en la llamada al método
- Pasar un argumento en la llamada al constructor


Ejemplo utilizando this con un atributo de clase (x):

```
public class Main {
  int x;

  // Constructor con un parámetro
  public Main(int x) {
    this.x = x;
  }

  // Llama al constructor
  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println("Valor de x = " + myObj.x);
  }
}
```


La palabra clave `super` se refiere a los objetos de la superclase (clase padre).

Se utiliza para llamar a métodos de la superclase y para acceder al constructor de la superclase.

El uso más común de la palabra clave `super` es para eliminar la confusión entre superclases y subclases que tienen métodos con el mismo nombre.

Ejemplo utilizando super para llamar a la superclase de Dog (subclase):

```
class Animal { // Superclase (padre)
  public void animalSound() {
    System.out.println("El animal hace un sonido");
  }
}

class Dog extends Animal { // Subclase (hijo)
  public void animalSound() {
    super.animalSound(); // Llama al método de la superclase
    System.out.println("El perro dice: guau guau");
  }
}

public class Main {
  public static void main(String args[]) {
    Animal myDog = new Dog(); // Crea un objeto Dog
    myDog.animalSound(); // Llama al método en el objeto Dog
  }
}
```

------------------------------------------------------------------

9. **Herencia Múltiple**: Java no permite la herencia múltiple de clases. ¿Cómo se puede simular o gestionar este concepto utilizando otras herramientas del lenguaje?

En Java, efectivamente no se permite la herencia múltiple de clases (a diferencia de lenguajes como C++), pero ofrece mecanismos alternativos para simular o gestionar este concepto:

_Interfaces_:

La principal herramienta para simular la herencia múltiple en Java es mediante el uso de interfaces:

```
// Interfaces
interface Nadador {
    void nadar();
}

interface Volador {
    void volar();
}

// Clase base
class Animal {
    void comer() {
        System.out.println("El animal come");
    }
}

// Clase que extiende una clase e implementa múltiples interfaces
class Pato extends Animal implements Nadador, Volador {
    @Override
    public void nadar() {
        System.out.println("El pato nada");
    }
    
    @Override
    public void volar() {
        System.out.println("El pato vuela");
    }
}
```

_Métodos default en interfaces (Java 8+)_

Con Java 8, las interfaces pueden tener métodos "default" con implementación:

```
interface Nadador {
    default void nadar() {
        System.out.println("Nadando");
    }
}

interface Volador {
    default void volar() {
        System.out.println("Volando");
    }
}

// Podemos "heredar" comportamiento de múltiples interfaces
class Ave implements Nadador, Volador {
    // Hereda implementaciones default de ambas interfaces
}
```

_Composición (preferida sobre herencia)_

La composición es un enfoque más recomendado que la herencia múltiple:

```
class Habilidades {
    private Nadador nadador;
    private Volador volador;
    
    public Habilidades(Nadador nadador, Volador volador) {
        this.nadador = nadador;
        this.volador = volador;
    }
    
    public void nadar() {
        nadador.nadar();
    }
    
    public void volar() {
        volador.volar();
    }
}

// Implementaciones concretas
class HabilidadNadarPato implements Nadador {
    public void nadar() {
        System.out.println("Nada como pato");
    }
}

class HabilidadVolarPato implements Volador {
    public void volar() {
        System.out.println("Vuela como pato");
    }
}

// Uso
class Pato {
    private Habilidades habilidades;
    
    public Pato() {
        this.habilidades = new Habilidades(new HabilidadNadarPato(), new HabilidadVolarPato());
    }
    
    public void nadar() {
        habilidades.nadar();
    }
    
    public void volar() {
        habilidades.volar();
    }
}
```

10. **Patrones de Diseño**: Explica brevemente qué son los patrones de diseño en la POO y menciona dos ejemplos (por ejemplo, Singleton, Factory, Observer, etc.) indicando su utilidad.

Los patrones de diseño son soluciones habituales a problemas que ocurren con frecuencia en el diseño de software. Son como planos prefabricados que se pueden personalizar para resolver un problema de diseño recurrente en tu código.

No se puede elegir un patrón y copiarlo en el programa como si se tratara de funciones o bibliotecas ya preparadas. El patrón no es una porción específica de código, sino un concepto general para resolver un problema particular. Puedes seguir los detalles del patrón e implementar una solución que encaje con las realidades de tu propio programa.

La mayoría de los patrones se describe con mucha formalidad para que la gente pueda reproducirlos en muchos contextos. Aquí tienes las secciones que suelen estar presentes en la descripción de un patrón:

- El propósito del patrón explica brevemente el problema y la solución.
- La motivación explica en más detalle el problema y la solución que brinda el patrón.
- La estructura de las clases muestra cada una de las partes del patrón y el modo en que se relacionan.
- El ejemplo de código en uno de los lenguajes de programación populares facilita la asimilación de la idea que se esconde tras el patrón.

A continuacion menciono dos patrones de diseño a modo de ejemplo:

1. _Factory Method_:

El patrón Factory Method proporciona una interfaz para crear objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crearán. Sus principales utilidades son:

- Creación flexible de objetos: Permite crear diferentes tipos de objetos sin especificar su clase concreta.
- Encapsulación de la creación: Oculta la lógica de creación del objeto y los detalles de implementación.
- Desacoplamiento: Reduce el acoplamiento entre el cliente y las clases concretas de producto.
- Extensibilidad: Facilita la adición de nuevos tipos de productos sin modificar el código cliente existente.
- Gestión centralizada: Centraliza la lógica de creación de objetos en un solo lugar.

Ejemplo:   

```
// Producto
interface Documento {
    void abrir();
}

// Productos concretos
class PDF implements Documento {
    public void abrir() { System.out.println("Abriendo PDF"); }
}

class Word implements Documento {
    public void abrir() { System.out.println("Abriendo Word"); }
}

// Creador
abstract class EditorDocumentos {
    // Factory Method
    public abstract Documento crearDocumento();
    
    public void nuevoDocumento() {
        Documento doc = crearDocumento();
        doc.abrir();
    }
}

// Creadores concretos
class EditorPDF extends EditorDocumentos {
    public Documento crearDocumento() {
        return new PDF();
    }
}

class EditorWord extends EditorDocumentos {
    public Documento crearDocumento() {
        return new Word();
    }
}
```
   
   

2. _Singleton_:

El patrón Singleton garantiza que una clase tenga solo una instancia y proporciona un punto de acceso global a ella. Sus principales utilidades son:

- Instancia única: Garantiza que solo exista una instancia de la clase en toda la aplicación.
- Acceso global: Proporciona un punto de acceso global a la instancia.
- Inicialización controlada: Permite la inicialización diferida de la instancia.
- Conservación de recursos: Reduce el consumo de memoria al evitar múltiples instancias.
- Control centralizado: Ideal para recursos compartidos como conexiones a bases de datos, configuraciones o caches.

Ejemplo:
```
public class Configuracion {
    // Instancia única
    private static Configuracion instancia;
    
    // Atributos de configuración
    private String urlServidor;
    private int puerto;
    
    // Constructor privado para evitar instanciación externa
    private Configuracion() {
        // Inicialización de valores por defecto
        urlServidor = "localhost";
        puerto = 8080;
    }
    
    // Método para obtener la instancia única (thread-safe)
    public static synchronized Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }
    
    // Métodos getter y setter
    public String getUrlServidor() {
        return urlServidor;
    }
    
    public void setUrlServidor(String urlServidor) {
        this.urlServidor = urlServidor;
    }
    
    public int getPuerto() {
        return puerto;
    }
    
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
}
```

