package Unidad3.Ejercicio1.CuentaBancaria;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private int numCuenta;

    public CuentaBancaria(String titular, double saldo, int numCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
     
    public void depositar(double cantidad){
        saldo += cantidad;
        System.out.println("Deposito exitoso"+ cantidad);

    }

    public void retirar (double cantidad){
        if (cantidad <= saldo) {
            saldo-= cantidad;
            System.out.println("Se ha retirado de su cuenta"+cantidad);
            
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
    
    public double consultarSaldo(){
        return saldo;
    }

    
    public void mostrarInformacion(){
        System.out.println("Titular: "+getTitular());
        System.out.println("numero de cuenta: "+getNumCuenta());
        System.out.println("saldo "+saldo);
    }
}
