package Lógica;

public class Kiosco {

    String códigoKiosco, nombreKioscos, códigoRegión;

    public Kiosco(String códigoKiosco, String nombreKioscos, String códigoRegión) {
        this.códigoKiosco = códigoKiosco;
        this.nombreKioscos = nombreKioscos;
        this.códigoRegión = códigoRegión;
    }

    public String getCódigoKiosco() {
        return códigoKiosco;
    }

    public void setCódigoKiosco(String códigoKiosco) {
        this.códigoKiosco = códigoKiosco;
    }

    public String getNombreKioscos() {
        return nombreKioscos;
    }

    public void setNombreKioscos(String nombreKioscos) {
        this.nombreKioscos = nombreKioscos;
    }

    public String getCódigoRegión() {
        return códigoRegión;
    }

    public void setCódigoRegión(String códigoRegión) {
        this.códigoRegión = códigoRegión;
    }

}
