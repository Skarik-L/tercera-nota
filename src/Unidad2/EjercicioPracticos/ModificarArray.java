package Unidad2.EjercicioPracticos;
import java.util.Arrays;
public class ModificarArray {
    public static void main(String[] args) {
        int[] numeroEnteros = {2,3,8,9};
        modificarArray(numeroEnteros);
        System.out.println(Arrays.toString(numeroEnteros));

    }

    public static void modificarArray( int[] numeroEnteros){
        int cantidadNumeros = numeroEnteros.length; 
        for( int i = 0; i < cantidadNumeros; i++ ){
            if( numeroEnteros[i] % 2 != 0){
                numeroEnteros[i]+= 1;
            }
        }

    }
}
