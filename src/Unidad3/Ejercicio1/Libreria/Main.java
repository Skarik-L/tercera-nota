package Unidad3.Ejercicio1.Libreria;

public class Main {
    public static void main(String[] args) {

        // Creamos un libro
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

        // Mostramos su información inicial
        System.out.println("Estado inicial del libro:");
        libro1.mostrarInformacion();
        System.out.println();

        // Intentamos prestar el libro
        System.out.println("Prestando el libro...");
        libro1.prestar();
        libro1.mostrarInformacion();
        System.out.println();

        // Intentamos prestar otra vez (ya está prestado)
        System.out.println("Intentando prestar de nuevo...");
        libro1.prestar();
        System.out.println();

        // Devolvemos el libro
        System.out.println("Devolviendo el libro...");
        libro1.devolver();
        libro1.mostrarInformacion();
        System.out.println();

        // Intentamos devolver otra vez (ya está disponible)
        System.out.println("Intentando devolver de nuevo...");
        libro1.devolver();
    }
} 

