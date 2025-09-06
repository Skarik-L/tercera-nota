
package unidad1;

public class App {
    public static void main(String[] args) throws Exception {
        
        int CantidadInicial = 1000;

        int Retiro = 4 * 200;

        int CantidadFinal = CantidadInicial - Retiro ;
        System.out.println("Al final del mes tendra en su cuenta: $" + CantidadFinal);  
    }
}
