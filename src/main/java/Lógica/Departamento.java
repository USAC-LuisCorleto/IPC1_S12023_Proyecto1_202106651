package Lógica;

public class Departamento {

    String codRegDpto, nombreRegDpto, nombreDpto, codDpto;

    public Departamento(String codRegDpto, String nombreRegDpto, String nombreDpto, String codDpto) {
        this.codRegDpto = codRegDpto;
        this.nombreRegDpto = nombreRegDpto;
        this.nombreDpto = nombreDpto;
        this.codDpto = codDpto;
    }

    public String getCodDpto() {
        return codDpto;
    }

    public void setCodDpto(String codDpto) {
        this.codDpto = codDpto;
    }

    public String getCodRegDpto() {
        return codRegDpto;
    }

    public void setCodRegDpto(String codRegDpto) {
        this.codRegDpto = codRegDpto;
    }

    public String getNombreRegDpto() {
        return nombreRegDpto;
    }

    public void setNombreRegDpto(String nombreRegDpto) {
        this.nombreRegDpto = nombreRegDpto;
    }

    public String getNombreDpto() {
        return nombreDpto;
    }

    public void setNombreDpto(String nombreDpto) {
        this.nombreDpto = nombreDpto;
    }

}
