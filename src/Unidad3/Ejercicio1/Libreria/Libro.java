package  Unidad3.Ejercicio1.Libreria;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas ;
    private boolean prestado;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void prestar(){

        if (!prestado) {
            prestado= true;
            System.out.println("libro prestado");
            
        } else{
            System.out.println("libro ya esta prestado");
        }
        
    }
    public void devolver(){
    if (prestado) {
        prestado = false;
        System.out.println("libro devuelto con exito");
    }else{
        System.out.println("el libro no esta prestado");
    }
        
    }
    public boolean estaPrestamo(){
        return prestado;
        
    }
    public void mostrarInformacion(){
        System.out.println("El libro: "+getTitulo()+" del autor: "+getAutor());
        System.out.println("estado: "+estaPrestamo());
        
    }
    

    

}
