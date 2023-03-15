package Lógica;

public class Envío {

    public String codPaquete, tipoEnvio, destinatario, totalEnvio, tipoPago;


    public Envío(String codPaquete, String tipoEnvio, String destinatario, String totalEnvio, String tipoPago) {
        this.codPaquete = codPaquete;
        this.tipoEnvio = tipoEnvio;
        this.destinatario = destinatario;
        this.totalEnvio = totalEnvio;
        this.tipoPago = tipoPago;
    
    }



    public String getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(String codPaquete) {
        this.codPaquete = codPaquete;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getTotalEnvio() {
        return totalEnvio;
    }

    public void setTotalEnvio(String totalEnvio) {
        this.totalEnvio = totalEnvio;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

}
