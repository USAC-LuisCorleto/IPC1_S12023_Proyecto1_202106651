package Lógica;

public class Usuario {

    public String correo, contraseña, DPI, nombre, nacimiento, genero, nacion, rol, teléfono;
    public int venta;

    public Usuario(String correo, String contraseña, String DPI, String nombre, String nacimiento, String genero, String nacion, String rol, String teléfono, int venta) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.DPI = DPI;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.teléfono = teléfono;
        this.genero = genero;
        this.rol = rol;
        this.nacion = nacion;
        this.venta = venta;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

}
