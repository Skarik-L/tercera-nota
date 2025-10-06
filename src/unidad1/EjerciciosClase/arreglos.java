package Unidad1.EjerciciosClase;

import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ingresar el número
        System.out.print("Ingresar un número: ");
        int dato = scanner.nextInt();
        int numbres[] = new int[dato];

        System.out.println(numbres.length);

        scanner.close();
    }
}
