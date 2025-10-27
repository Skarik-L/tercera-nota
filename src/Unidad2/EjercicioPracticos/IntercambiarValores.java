package Unidad2.EjercicioPracticos;

public class IntercambiarValores{
    public static void intercambiar( int a , int b){
        int temporal = a;
        a = b;
        b = temporal;
        System.out.println("En el metodo a = " + a + " y b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Antes de llamar al metodo: a = " + a + ", b = " + b);
        intercambiar(a, b);
        System.out.println("Después de llamar al metodo: a = " + a + ", b = " + b);

    }
}