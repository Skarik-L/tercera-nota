package Unidad1.EjerciciosClase;
// programa que genere la tabla de multiplicar de un número ingresado por el usuario utilizando un ciclo for
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         
        // ingresar el #
        System.out.println("Ingresar un número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 9 ; i++){
            int producto = num * i;
            

            System.out.println( i + "x" + num + "=" + producto);
        }
        scanner.close();

    }
}
