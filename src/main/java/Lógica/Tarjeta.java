package Lógica;

public class Tarjeta {

    String nombredeTarjeta, númerodeTarjeta, fechadeVencimiento;

    public Tarjeta(String nombredeTarjeta, String númerodeTarjeta, String fechadeVencimiento) {
        this.nombredeTarjeta = nombredeTarjeta;
        this.númerodeTarjeta = númerodeTarjeta;
        this.fechadeVencimiento = fechadeVencimiento;
    }

    public String getNombredeTarjeta() {
        return nombredeTarjeta;
    }

    public void setNombredeTarjeta(String nombredeTarjeta) {
        this.nombredeTarjeta = nombredeTarjeta;
    }

    public String getNúmerodeTarjeta() {
        return númerodeTarjeta;
    }

    public void setNúmerodeTarjeta(String númerodeTarjeta) {
        this.númerodeTarjeta = númerodeTarjeta;
    }

    public String getFechadeVencimiento() {
        return fechadeVencimiento;
    }

    public void setFechadeVencimiento(String fechadeVencimiento) {
        this.fechadeVencimiento = fechadeVencimiento;
    }

}
