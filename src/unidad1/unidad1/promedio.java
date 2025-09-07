package unidad1;

import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float num1,num2,num3,promedio;

        System.out.println( "Ingresa 3 numeros: ");

        num1 = input.nextFloat();

        num2 = input.nextFloat();

        num3 = input.nextFloat();

        promedio = (num1 + num2 + num3)/3;

        System.out.println("EL promedio de las 3 calificaciones es: " + promedio);

        input.close();

    }

}

