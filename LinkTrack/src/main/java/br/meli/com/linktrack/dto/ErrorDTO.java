package br.meli.com.linktrack.dto;

public class ErrorDTO {

    private int status;
    private  String mensage;

    public ErrorDTO(int status, String mensage) {
        this.status = status;
        this.mensage = mensage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }

}
