package ar.edu.unlar.paradigmas3.objetos;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String direccion;
    private ArrayList<Catalogo> catalogos;
    
    //private ArrayList <Socio> socios;


    public Tienda(String nombre, String direccion, ArrayList<Catalogo> catalogos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogos = catalogos;
    }



    public ArrayList<Catalogo> getCatalogos() {
        return catalogos;
    }
    public void setCatalogos(ArrayList<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }



    @Override
    public String toString() {
        return "\nTienda [nombre=" + nombre + ", direccion=" + direccion + ", catalogos=" + catalogos + "]\n\nFIN CATALOGO\n\n";
    }


    

}
