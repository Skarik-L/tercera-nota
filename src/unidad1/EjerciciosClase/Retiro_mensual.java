
package Unidad1.EjerciciosClase;

public class Retiro_mensual {
    public static void main(String[] args) throws Exception {
        
        int CantidadInicial = 1000;

        int Retiro = 4 * 200;

        int CantidadFinal = CantidadInicial - Retiro ;
        System.out.println("Al final del mes tendra en su cuenta: $" + CantidadFinal);  
    }
}
