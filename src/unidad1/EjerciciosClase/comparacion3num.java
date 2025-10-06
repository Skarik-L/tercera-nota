package Unidad1.EjerciciosClase;

import java.util.Scanner;

public class comparacion3num {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // pedir los datos 
        System.out.print("Ingresar el número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresar el número 2: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresar el número 3: ");
        int numero3 = scanner.nextInt();

        // condición del if
        if ((numero1 >= numero2) && (numero1 >= numero3)) {
            System.out.println("El número " + numero1 + " es el mayor");
        } else if ((numero2 >= numero1) && (numero2 >= numero3)) {
            System.out.println("El número " + numero2 + " es el mayor");
        } else {
            System.out.println("El número " + numero3 + " es el mayor");
        }

        scanner.close(); // buena práctica
    }
}
