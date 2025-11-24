package Unidad3.Ejercicio1.Ejercicio2;

public class Auto {
    private String marca;
    private String modelo;
    private double velocidadActual;
    private double combustible;

    public Auto(String marca, String modelo, double velocidadActual, double combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    //Metodos
    public void acelerar(double kmh){
        velocidadActual += kmh;

    }

    public void frenar (double kmh){
        velocidadActual -= kmh;
        if (velocidadActual<0) 
            velocidadActual=0;{
        }
    }

    public void recargarCombustible(double litros){
        combustible += litros;
    }

    public void mostrarEstado(){
        System.out.println("El carro "+getMarca()+ " "+getModelo());
        System.out.println("Tiene una aceleracion: "+ getVelocidadActual());
        System.out.println("combustible es de: "+getCombustible());
    }
    

    

}
