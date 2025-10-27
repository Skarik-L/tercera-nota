package Unidad2.EjercicioPracticos;
public class ValorModificado {
    public static void main(String[] args) {
        int x  = 5;
        System.out.println("Antes de retornar x = " + x);
        x = incrementar(x);
        
        System.out.println("Despues de retornar x = "+x);


    }
    public static int incrementar (int x){
        return x += 1;

    }
}
