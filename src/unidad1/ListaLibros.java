import java.util.Scanner;

public class ListaLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de libros
        System.out.print("¿Cuántos libros deseas ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // deja guardar mas de una palabra

        // Arreglo que almacena los nombres 
        String[] libros = new String[cantidad];

        // Pedir los nombres de los libros con el for
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el título del libro " + (i + 1) + ": ");
            libros[i] = scanner.nextLine();
        }

        // Imprimir con el for
        System.out.println(" Lista de libros ingresados: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + libros[i]);
        }

        
    }
}
