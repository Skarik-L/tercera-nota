package Unidad3.Ejercicio1;
public class Rectangulo {

    private double ancho;
    private double alto;
    

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }


    public double getAncho() {
        return ancho;
    }


    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public double getAlto() {
        return alto;
    }


    public void setAlto(double alto) {
        this.alto = alto;
    }

    //METODOS
    public double  calcularArea (){
        double area = ancho * alto;
        return area;

    }

    public double calcularPerimentro (){
        double perimetro = 2*alto + 2*ancho;
        return perimetro;
    }

    public boolean esCuadrado(){
        boolean cuadrado = false;
        if ( ancho == alto ) {
         cuadrado = true;
        }
        return cuadrado;
    }
    
    public void mostrarDatos(){
        System.out.println("El ancho es:"+getAncho()+" El alto es: "+getAlto());
        System.out.println("El area es: "+calcularArea());
        System.out.println("El perimetro es: "+calcularPerimentro());
        System.out.println("¿?Es cuadrado ¿? "+esCuadrado());

    }



    

    
}


