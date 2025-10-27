package Unidad2.EjercicioPracticos;
public class PasoPorValor {
    public static void main(String[] args) {
    
    int a = 0;
    int b = 5;
    System.out.println( "Antes del metodo a = " + a + " y b = " +b);
    intercambiar(a, b);
    System.out.println( "Despues del metodo a = " + a + " y b = " +b);
   
    
}

    public static void intercambiar(int a, int b){
        int A = a;
        a = b;
        b = A;
        //Mostrar k si se cambian los valores :D
        System.out.println("Este es el valor de a = " + a);
        System.out.println("Este es el valor de b = " + b);


    }

}
    

