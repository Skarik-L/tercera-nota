package Unidad1.TallerPractico;

import java.util.Scanner;

public class Poligono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tipo de polígono (triangulo, cuadrado o rectangulo): ");
        String tipo = sc.nextLine().toLowerCase();

        double area = 0;

        switch (tipo) {
            case "triangulo":
                System.out.print("Base: ");
                double baseT = sc.nextDouble();
                System.out.print("Altura: ");
                double alturaT = sc.nextDouble();
                area = calcularArea(tipo, baseT, alturaT);
                break;
            case "cuadrado":
                System.out.print("Lado: ");
                double lado = sc.nextDouble();
                area = calcularArea(tipo, lado, 0);
                break;
            case "rectangulo":
                System.out.print("Base: ");
                double baseR = sc.nextDouble();
                System.out.print("Altura: ");
                double alturaR = sc.nextDouble();
                area = calcularArea(tipo, baseR, alturaR);
                break;
            default:
                System.out.println("Polígono no válido");
                System.exit(0);
        }
        sc.close();

        System.out.println("El área del " + tipo + " es: " + area);
    }

    public static double calcularArea(String tipo, double a, double b) {
        switch (tipo) {
            case "triangulo":
                return (a * b) / 2;
            case "cuadrado":
                return a * a;
            case "rectangulo":
                return a * b;
            default:
                return 0;
        }
    }
}

