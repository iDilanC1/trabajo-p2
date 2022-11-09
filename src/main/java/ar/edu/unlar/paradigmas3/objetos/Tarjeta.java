package ar.edu.unlar.paradigmas3.objetos;


public class Tarjeta {
    private int saldo;
    private int idTarjeta;
    private String año_vencimiento;
    
    public Tarjeta(int saldo, int idTarjeta, String año_vencimiento) {
        this.saldo = saldo;
        this.idTarjeta = idTarjeta;
        this.año_vencimiento = año_vencimiento;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
    @Override
    public String toString() {
        return "\nTarjeta [saldo=" + saldo + ", idTarjeta=" + idTarjeta + ", año_vencimiento=" + año_vencimiento + "]\n";
    }




}
