package unidad1;

public class store_descuentos {
    public static void main(String[] args) throws Exception {

        // declaración de variables
        double costCamiseta = 25.0;
        double costPants = 30.0;

        // declaración de los descuentos
        double descuentoBase = 0.15;
        double descuentoAdicional = 0.05;

        // precio para una camiseta y un pantalón con 15% de descuento
        double camisetadescuento = costCamiseta * (1 - descuentoBase);
        double pantsdescuento = costPants * (1 - descuentoBase);

        double total1 = camisetadescuento + pantsdescuento;

        System.out.println("El precio para un pantalón y una camiseta es de: $" + total1);

        // precio de una segunda camiseta con 5% adicional sobre la ya rebajada
        double segundaCamiseta = camisetadescuento * (1 - descuentoAdicional);
        double total2 = total1 + segundaCamiseta;

        System.out.println("El precio para dos camisetas y un pantalón es de: $" + total2);
    }
}