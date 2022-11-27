package ar.edu.unlar.paradigmas3.objetos;

public class Item {
    private Pelicula pelicula;
    private int cantidad;
    private Boolean disponible;
    
    public Item(Pelicula pelicula, int cantidad, Boolean disponible) {
        this.pelicula = pelicula;
        this.cantidad = cantidad;
        this.disponible = disponible;
        
    }
 
    public Boolean sacarPelicula(int cantidad_sacada){

        if (cantidad_sacada <= cantidad){
            cantidad -= cantidad_sacada;
            return disponible = cantidad != 0; 
        }
        else{
            return false;
        }

    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    
        @Override
    public String toString() {
        return "\nItem [pelicula=" + pelicula + ", cantidad=" + cantidad + ", disponible=" + disponible + "]\n";
    }



}
