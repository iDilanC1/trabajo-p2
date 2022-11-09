package ar.edu.unlar.paradigmas3.objetos;

public class Pedido {
    private String tipoPedido;
    private int idPedido;
    private Socio socio;
    private Pelicula pelicula;
    private int precio;
    
    public Pedido(int idPedido, Socio socio, Pelicula pelicula, int precio) {
        this.idPedido = idPedido;
        this.socio = socio;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pedido [tipoPedido=" + tipoPedido + ", idPedido=" + idPedido + ", socio=" + socio + ", pelicula="
                + pelicula + ", precio=" + precio + "]";
    }

    
}
