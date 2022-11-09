package ar.edu.unlar.paradigmas3.objetos;

public class Pelicula {
    private String nombre;
    private String genero;
    private int clasificacion;
    private int año;
    private int precioAlquiler;
    private int precioVenta;
    

    public Pelicula(String nombre, String genero, int clasificacion, int año, int precioAlquiler, int precioVenta) {
        this.nombre = nombre;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.año = año;
        this.precioAlquiler = precioAlquiler;
        this.precioVenta = precioVenta;
    }

    public int getClasificacion() {
        return clasificacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

        @Override
    public String toString() {
        return "\nPelicula [nombre=" + nombre + ", genero=" + genero + ", clasificacion=" + clasificacion + ", año=" + año
                + ", precioAlquiler=" + precioAlquiler + ", precioVenta=" + precioVenta + "]\n";
    }


    
}
