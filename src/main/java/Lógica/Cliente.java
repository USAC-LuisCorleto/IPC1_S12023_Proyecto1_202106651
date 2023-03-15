package Lógica;

public class Cliente {

    String nombreCompletoCliente, direcciónCliente, NITCliente;
    
    
    public Cliente(String nombreCompletoCliente, String direcciónCliente, String NITCliente) {
        this.nombreCompletoCliente = nombreCompletoCliente;
        this.direcciónCliente = direcciónCliente;
        this.NITCliente = NITCliente;
    }

    public String getNombreCompletoCliente() {
        return nombreCompletoCliente;
    }

    public void setNombreCompletoCliente(String nombreCompletoCliente) {
        this.nombreCompletoCliente = nombreCompletoCliente;
    }

    public String getDirecciónCliente() {
        return direcciónCliente;
    }

    public void setDirecciónCliente(String direcciónCliente) {
        this.direcciónCliente = direcciónCliente;
    }

    public String getNITCliente() {
        return NITCliente;
    }

    public void setNITCliente(String NITCliente) {
        this.NITCliente = NITCliente;
    }

}
