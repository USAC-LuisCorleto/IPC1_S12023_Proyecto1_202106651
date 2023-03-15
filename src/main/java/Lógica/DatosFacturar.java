package Lógica;

public class DatosFacturar {

    String nombreClienteUsuario, direcciónClienteUsuario, nitClienteUsuario;

    public DatosFacturar(String nombreClienteUsuario, String direcciónClienteUsuario, String nitClienteUsuario) {
        this.nombreClienteUsuario = nombreClienteUsuario;
        this.direcciónClienteUsuario = direcciónClienteUsuario;
        this.nitClienteUsuario = nitClienteUsuario;
    }

    public String getNombreClienteUsuario() {
        return nombreClienteUsuario;
    }

    public void setNombreClienteUsuario(String nombreClienteUsuario) {
        this.nombreClienteUsuario = nombreClienteUsuario;
    }

    public String getDirecciónClienteUsuario() {
        return direcciónClienteUsuario;
    }

    public void setDirecciónClienteUsuario(String direcciónClienteUsuario) {
        this.direcciónClienteUsuario = direcciónClienteUsuario;
    }

    public String getNitClienteUsuario() {
        return nitClienteUsuario;
    }

    public void setNitClienteUsuario(String nitClienteUsuario) {
        this.nitClienteUsuario = nitClienteUsuario;
    }

}
