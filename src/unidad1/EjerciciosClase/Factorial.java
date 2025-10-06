package Unidad1.EjerciciosClase;
import java.util.Scanner;

// Desarrolla un programa que calcule el factorial 
// de un número dado por el usuario utilizando un ciclo while.

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ingresar el número
        System.out.print("Ingresar un número: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Error: el número debe ser positivo.");
        } else {
            int contador = 1;
            long factorial = 1; // usar long por si el número es grande

            // while
            while (contador <= num) {
                factorial = factorial * contador;
                contador++;
            }

            System.out.println("El factorial de " + num + " es: " + factorial);
        }

        scanner.close();
    }
}

