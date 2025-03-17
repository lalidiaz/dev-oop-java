# Challenge de Programación OOP (Java)

Este repositorio contiene la solución a varios ejercicios de programación en Java, demostrando conceptos como herencia, interfaces, excepciones, patrones de diseño y más.


## Respuestas Teóricas 

Las respuestas a las preguntas teoricas se encuentran en el directorio `/docs/respues.md`.

## Respuestas Prácticas 

El proyecto está organizado en carpetas por ejercicio dentro del directorio `/src`.

Cada carpeta contiene todas las clases necesarias para ese ejercicio, incluyendo una clase `Main` para demostrar su funcionamiento.

## Requisitos

- Java 8 o superior
- Compilador de Java (javac)

## Cómo Ejecutar

Puedes ejecutar cada ejercicio individualmente siguiendo estos pasos:

1. Navega a la carpeta del ejercicio que deseas probar:
   ```bash
   cd src/[nombre_carpeta]
   ```
   Por ejemplo: `cd src/biblioteca`

2. Compila todos los archivos Java en esa carpeta:
   ```bash
   javac *.java
   ```

3. Ejecuta la clase principal:
   ```bash
   java Main
   ```

## Ejercicios Incluidos

### 11. Clase Persona
- **Carpeta**: `/persona`
- **Descripción**: Simple implementación de una clase Persona con atributos y métodos básicos.
- **Conceptos**: Encapsulamiento, getters/setters
- 
### 12. Jerarquía de Cuentas Bancarias
- **Carpeta**: `/banco`
- **Descripción**: Implementación de una jerarquía de clases para representar cuentas bancarias con métodos para depositar y retirar dinero.
- **Conceptos**: Herencia, sobreescritura de métodos

### 13. Interfaz Operable
- **Carpeta**: `/operaciones`
- **Descripción**: Definición de una interfaz Operable con implementaciones para suma y multiplicación.
- **Conceptos**: Interfaces, polimorfismo

### 14. Sobrecarga en Calculadora
- **Carpeta**: `/calculadora`
- **Descripción**: Implementación de una clase Calculadora con métodos sobrecargados.
- **Conceptos**: Sobrecarga de métodos

### 15. Herencia en Vehículos
- **Carpeta**: `/vehiculos`
- **Descripción**: Jerarquía de clases para vehículos con especialización para coches y motos.
- **Conceptos**: Herencia, sobreescritura

### 16. Clase Abstracta Animal
- **Carpeta**: `/animales`
- **Descripción**: Clase abstracta Animal con implementaciones concretas para diferentes tipos de animales.
- **Conceptos**: Clases abstractas, métodos abstractos

### 17. Gestión de Empleados
- **Carpeta**: `/empresa`
- **Descripción**: Sistema para gestionar empleados de una empresa.
- **Conceptos**: Colecciones, ArrayList

### 18. Excepciones Personalizadas
- **Carpeta**: `/inventario`
- **Descripción**: Implementación de excepciones personalizadas para un sistema de inventario.
- **Conceptos**: Excepciones personalizadas, manejo de excepciones

### 19. Sistema de Préstamo de Libros
- **Carpeta**: `/biblioteca`
- **Descripción**: Sistema para gestionar préstamos de libros con verificación de disponibilidad.
- **Conceptos**: Manejo de excepciones, colecciones

### 20. Patrón Singleton
- **Carpeta**: `/juego`
- **Descripción**: Implementación del patrón de diseño Singleton para una clase Juego.
- **Conceptos**: Patrones de diseño, Singleton


