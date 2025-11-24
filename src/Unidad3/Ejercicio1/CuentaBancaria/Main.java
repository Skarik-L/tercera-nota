package Unidad3.Ejercicio1.CuentaBancaria;

public class Main {
public static void main(String[] args) {
    CuentaBancaria p1 = new CuentaBancaria("Juan", 7000, 1234);

    System.out.println("inicio");
    p1.mostrarInformacion();
    System.out.println();

    System.out.println("Depositando...");
    p1.depositar(2000);
    p1.mostrarInformacion();
    System.out.println();
    
    System.out.println("Retirando....");
    p1.retirar(100000000);
    p1.mostrarInformacion();


}
    

    
}
