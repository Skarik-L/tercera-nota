package Unidad1.EjerciciosClase;


//Crea un programa que cuente cuántos números pares hay entre 1 y 100 utilizando un ciclo for

public class ContadorPares {
    public static void main(String[] args) {
        
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if ( i % 2 == 0) {
                contador ++;
                System.out.println( contador + ". El número " + i + " es par ");
            }
        }


    }
}
