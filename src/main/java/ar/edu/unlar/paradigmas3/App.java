package ar.edu.unlar.paradigmas3;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unlar.paradigmas3.objetos.*;

public class App 
{
    public static void main( String[] args ) {
        
        Scanner input = new Scanner(System.in);
        ArrayList <Socio> socios = new ArrayList<>();
        ArrayList <Tarjeta> tarjetas = new ArrayList<>();
        ArrayList <Item> items = new ArrayList<>();

        ArrayList <Catalogo> catalogos = new ArrayList<>();
        ArrayList <Pedido> pedidos = new ArrayList<>();

        int i,j, cantidad_pedido;
        //socio
        int edad, idSocio;
        String nombre, apellido, dni, direccion, telefono, email;

        int generarSocios = 1;

        //tarjeta
        int saldo, idTarjeta;
        String añoVencimiento;

        //tienda
        String nombreTienda, direccionTienda;


        //item
        int cantidad_pelicula;
        Boolean isDisponible;

        //catálogo
        int generarCatalogos = 1;


        //pelicula
        String nombrePelicula, genero;
        int año, precioAlquiler, precioVenta, clasificacion;

        //pedido
        int idPedido, realizarPedido = 1;
        String nombreSocio, buscaPelicula, tipoPedido;

        int precioPeliculaTotal;

        
        System.out.println("Nombre de la tienda");
        nombreTienda = input.nextLine();
        System.out.println("Dirección de la tienda: ");
        direccionTienda = input.nextLine();


        do{// generar el catálogos
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        System.out.println("Cargar información de la pelicula a agregar al catalogo: ");

        System.out.println("Ingrese el nombre de la pelicula a agregar al catalogo: ");
        nombrePelicula = input.nextLine();

        System.out.println("Ingrese el genero de la pelicula: ");
        genero = input.nextLine();

        System.out.println("Ingrese la clasificacion de mayor de:");
        clasificacion = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el año en el que salio la pelicula:");
        año = input.nextInt(); 
        input.nextLine();

        System.out.println("Ingrese el precio de alquiler de la pelicula: ");
        precioAlquiler = input.nextInt(); 
        input.nextLine();

        System.out.println("Ingrese el precio de la venta de la pelicula: ");
        precioVenta = input.nextInt(); 
        input.nextLine();
        
        System.out.println("Cantidad de peliculas que dispone");
        cantidad_pelicula = input.nextInt();
        input.nextLine();

        isDisponible = (cantidad_pelicula > 0);


        Pelicula pelicula = new Pelicula(nombrePelicula, genero, clasificacion, año, precioAlquiler, precioVenta);

        Item item = new Item(pelicula, cantidad_pelicula, isDisponible);

        items.add(item);
        Catalogo catalogo = new Catalogo(items); 

        catalogos.add(catalogo);
        
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        System.out.println("Desea agregar más peliculas al catalogo?\n0. No\n1. Si\n- ");
        generarCatalogos = input.nextInt();
        input.nextLine();


        }while(generarCatalogos == 1);

        Tienda tienda = new Tienda(nombreTienda, direccionTienda, catalogos);




;
        do { // Creación de socio y tarjeta asociada
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            System.out.println("Desea agregar un socio?\n0. No\n1. Si\n-");
            generarSocios = input.nextInt(); 
            input.nextLine();
            if(generarSocios != 1){ break;}

            System.out.println("Complete la siguiente información del socio: \n");

            System.out.println("nombre: ");
            nombre = input.nextLine();
            System.out.println("apellido: ");
            apellido = input.nextLine();
            System.out.println("Dni: ");
            dni = input.nextLine();
            System.out.println("Dirección: ");
            direccion = input.nextLine();
            System.out.println("Número de teléfon:o ");
            telefono = input.nextLine();
            System.out.println("dirección email: ");
            email = input.nextLine();
            System.out.println("Edad: ");
            edad = input.nextInt();
            input.nextLine();
            System.out.println("idSocio");
            idSocio = input.nextInt();
            input.nextLine();
            System.out.println("Id de la tarjeta que tendrá: ");
            idTarjeta = input.nextInt();
            input.nextLine();
            System.out.println("Saldo: ");
            saldo = input.nextInt();
            input.nextLine();
            System.out.println("año de vencimiento: ");
            añoVencimiento = input.nextLine();

            Tarjeta tarjeta = new Tarjeta(saldo, idTarjeta, añoVencimiento);
            //tarjetas.add(tarjeta);

            Socio socio = new Socio(nombre, apellido, dni, direccion, telefono, email, edad, idSocio,tarjeta);
            socios.add(socio);


            //condicion = 0;

        }while(generarSocios == 1);


        //System.out.println(socios);
        //System.out.println("\n\n");
        //System.out.println(tienda);
        System.out.println(catalogos);


        System.out.println("\n\n\n\n\n");
        System.out.println("\t\tCargar el pedido del cliente: ");
        System.out.println("\nIngrese la id del pedido ");
        idPedido = input.nextInt();
        input.nextLine();
        System.out.println("Nombre del socio: ");
        nombreSocio = input.nextLine();
        System.out.println("Nombre de la pelicula que desea el socio: ");
        buscaPelicula = input.nextLine();
        
        do{
            System.out.println("Ingrese si es un pedido de venta o alquiler:\n0. No realizar pedido\n1. Alquiler\n2. Venta\n-");
            realizarPedido = input.nextInt();
            input.nextLine();
            if(realizarPedido == 1){
                tipoPedido = "Alquilado";

                System.out.println("Cantidad a alquilar: ");
                cantidad_pedido = input.nextInt(); input.nextLine(); 
                    //Falta hacer que se baje el stock y que se permita por la edad
                for(i = 0; i < socios.size(); i++) {
                    if(socios.get(i) instanceof Socio && (socios.get(i).getNombre()).equals(nombreSocio)) {
                            System.out.println("Socio encontrado\n" + socios.get(i));

                            for(j = 0; j < socios.size(); j++) {

                                if(items.get(j) instanceof Item) {
                                    Item it = (Item) items.get(j);
                                    // && it.sacarPelicula(cantidad_pelicula)
                                    if((it.getPelicula().getNombre()).equals(buscaPelicula)) {

                                        System.out.println("Pelicula encontrada\n" + it.getPelicula());
                                        Pelicula peliculaEncotrada = it.getPelicula();
            
                                        if(it.getPelicula().getClasificacion() <= socios.get(i).getEdad()) {

                                            if(it.sacarPelicula(cantidad_pelicula) && it.getPelicula().getPrecioAlquiler() <= socios.get(i).getTarjeta().getSaldo()){

                                                socios.get(i).getTarjeta().setSaldo(socios.get(i).getTarjeta().getSaldo() - it.getPelicula().getPrecioAlquiler() * cantidad_pedido);

                                                Pedido pedido = new Pedido(tipoPedido, idPedido, socios.get(i), it.getPelicula() ,it.getPelicula().getPrecioAlquiler());
                                                pedidos.add(pedido);

                                            }
                                            else{
                                                System.out.println("Cantidad mayor a la deseada");
                                            }


                                        }

                                    }

                                }else{
                                    System.out.println("Pelicula no encontrada");
                                }

                            }
                            
                    }else{
                            System.out.println("Socio no encontrado");
                        }         
                }//fin for i
                      
            } // fin if realizarPedido

            if(realizarPedido == 2){
                tipoPedido = "Venta";

                System.out.println("Cantidad a vender: ");
                cantidad_pedido = input.nextInt(); input.nextLine(); 
                    //Falta hacer que se baje el stock y que se permita por la edad
                for(i = 0; i < socios.size(); i++) {
                    if(socios.get(i) instanceof Socio && (socios.get(i).getNombre()).equals(nombreSocio)) {
                            System.out.println("Socio encontrado\n" + socios.get(i));

                            for(j = 0; j < socios.size(); j++) {

                                if(items.get(j) instanceof Item) {
                                    Item it = (Item) items.get(j);
                                    // && it.sacarPelicula(cantidad_pelicula)
                                    if((it.getPelicula().getNombre()).equals(buscaPelicula)) {

                                        System.out.println("Pelicula encontrada\n" + it.getPelicula());
                                        Pelicula peliculaEncotrada = it.getPelicula();
            
                                        if(it.getPelicula().getClasificacion() <= socios.get(i).getEdad()) {

                                            if(it.sacarPelicula(cantidad_pelicula) && it.getPelicula().getPrecioVenta() <= socios.get(i).getTarjeta().getSaldo()){

                                                socios.get(i).getTarjeta().setSaldo(socios.get(i).getTarjeta().getSaldo() - it.getPelicula().getPrecioVenta() * cantidad_pedido);

                                                Pedido pedido = new Pedido(tipoPedido, idPedido, socios.get(i), it.getPelicula() ,it.getPelicula().getPrecioVenta());
                                                pedidos.add(pedido);


                                            }
                                            else{
                                                System.out.println("Cantidad mayor a la deseada");
                                            }

                                        }

                                    }

                                }else{
                                    System.out.println("Pelicula no encontrada");
                                }

                            }
                            
                    }else{
                            System.out.println("Socio no encontrado");
                        }         
                }//fin for i
                      
            } // fin if realizarPedido
        }while(realizarPedido != 0 || realizarPedido == 1 || realizarPedido == 2);


        System.out.println(pedidos);
        System.out.println("\n\n" + socios);
        System.out.println("\n\n" + catalogos);


    }
}
