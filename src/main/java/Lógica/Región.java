package Lógica;

public class Región {

    String agcódigoRegión, agnombreRegión, agprecioEstándar, agPrecioEspecial;

    public String getAgcódigoRegión() {
        return agcódigoRegión;
    }

    public void setAgcódigoRegión(String agcódigoRegión) {
        this.agcódigoRegión = agcódigoRegión;
    }

    public String getAgnombreRegión() {
        return agnombreRegión;
    }

    public void setAgnombreRegión(String agnombreRegión) {
        this.agnombreRegión = agnombreRegión;
    }

    public String getAgprecioEstándar() {
        return agprecioEstándar;
    }

    public void setAgprecioEstándar(String agprecioEstándar) {
        this.agprecioEstándar = agprecioEstándar;
    }

    public String getAgPrecioEspecial() {
        return agPrecioEspecial;
    }

    public void setAgPrecioEspecial(String agPrecioEspecial) {
        this.agPrecioEspecial = agPrecioEspecial;
    }

    public Región(String agcódigoRegión, String agnombreRegión, String agprecioEstándar, String agPrecioEspecial) {
        this.agcódigoRegión = agcódigoRegión;
        this.agnombreRegión = agnombreRegión;
        this.agprecioEstándar = agprecioEstándar;
        this.agPrecioEspecial = agPrecioEspecial;
    }
}
