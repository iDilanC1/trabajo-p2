package ar.edu.unlar.paradigmas3.objetos;

import java.util.ArrayList;

public class Catalogo {

    //private Tienda tienda;
    private ArrayList<Item> items;


    public Catalogo(ArrayList<Item> items) {
        this.items = items;
    }


    public void agregarItems(Item item){
        items.add(item);
    }



        @Override
    public String toString() {
        return "\nCatalogo [items=" + items + "]\n";
    }

 
    
}
