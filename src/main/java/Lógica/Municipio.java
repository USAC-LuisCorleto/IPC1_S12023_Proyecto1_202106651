package Lógica;

public class Municipio {

    String codDptoMun, nombreMun;

    public Municipio(String codDptoMun, String nombreMun) {
        this.codDptoMun = codDptoMun;
        this.nombreMun = nombreMun;
    }

    public String getCodDptoMun() {
        return codDptoMun;
    }

    public void setCodDptoMun(String codDptoMun) {
        this.codDptoMun = codDptoMun;
    }

    public String getNombreMun() {
        return nombreMun;
    }

    public void setNombreMun(String nombreMun) {
        this.nombreMun = nombreMun;
    }

}
