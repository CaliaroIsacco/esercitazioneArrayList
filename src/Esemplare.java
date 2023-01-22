public abstract class Esemplare {

    private int eta;
    private String identificativo;

    public Esemplare(int eta, String identificativo) {
        this.eta = eta;
        this.identificativo = identificativo;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }

    public abstract void stampa();
}
