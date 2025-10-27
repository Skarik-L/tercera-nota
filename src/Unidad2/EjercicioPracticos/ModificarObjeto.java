package Unidad2.EjercicioPracticos;
class Rectangulo {

        int ancho;
        int alto;
        Rectangulo(int ancho, int alto){
            this.ancho = ancho;
            this.alto = alto;
        }
    
}

public class ModificarObjeto {
     public static void main(String[] args) {
     Rectangulo rectangulo1 = new Rectangulo(5,6);
     modificarRectangulo(rectangulo1);
     System.out.println(rectangulo1.alto + " " + rectangulo1.ancho);
   }

    public static void modificarRectangulo(Rectangulo rectangulo1){
        rectangulo1.alto = 10;
        rectangulo1.ancho = 12;


    }
}

