package Unidad2.EjercicioPracticos;
public class CadenaValor {
    public static void main(String[] args) {
        String nombre = "Skarik";
        System.out.println("Antes de llamar al metodo: " + nombre);
        moificarCadena(nombre);
        System.out.println("Despues de llamar al metodo: " + nombre);

    }
    public static void moificarCadena(String nombre){
        nombre = "Skarik Barbosa";
        System.out.println("En el metodo:" + nombre);

    }
}
