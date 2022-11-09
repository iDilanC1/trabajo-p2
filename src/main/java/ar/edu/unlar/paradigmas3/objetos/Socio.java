package ar.edu.unlar.paradigmas3.objetos;


public class Socio {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String email;
    private int edad;
    private int idSocio;
    private Tarjeta tarjeta;


    public Tarjeta getTarjeta() {
        return tarjeta;
    }


    public Socio(String nombre, String apellido, String dni, String direccion, String telefono, String email, int edad,
            int idSocio, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
        this.idSocio = idSocio;
        this.tarjeta = tarjeta;
    }



    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }


        @Override
    public String toString() {
        return "Socio [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
                + ", telefono=" + telefono + ", email=" + email + ", edad=" + edad + ", idSocio=" + idSocio
                + ", tarjeta=" + tarjeta + "]";
    }



    

}