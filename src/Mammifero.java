public class Mammifero extends Esemplare{

    private int peridoGestazione;

    public Mammifero(int eta, String identificativo, int peridoGestazione) {
        super(eta, identificativo);
        this.peridoGestazione = peridoGestazione;
    }

    public int getPeridoGestazione() {
        return peridoGestazione;
    }

    public void setPeridoGestazione(int peridoGestazione) {
        this.peridoGestazione = peridoGestazione;
    }

    @Override
    public void stampa() {
        System.out.println("eta : " + getEta() + ", identificativo : " + getIdentificativo() + ", periodo gestazione : " + getPeridoGestazione());
    }
}
