package Unidad3.Ejercicio1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Auto p1 = new Auto("Toyota", "4x4", 60, 1);
        Auto p2 = new Auto("Yamaha", "5x5", 20, 50);

        System.out.println("=== Estado inicial ===");
        p1.mostrarEstado();
        p2.mostrarEstado();

        p1.acelerar(30); 
        System.out.println("\n=== Después de acelerar p1 ===");
        p1.mostrarEstado();

        p2.frenar(10); 
        System.out.println("\n=== Después de frenar p2 ===");
        p2.mostrarEstado();

        p1.recargarCombustible(20);
        System.out.println("\n=== Después de recargar combustible p1 ===");
        p1.mostrarEstado();
    }
}
