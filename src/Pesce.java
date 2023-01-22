public class Pesce extends Esemplare{

    private int profondita;

    public Pesce(int eta, String identificativo, int profondita) {
        super(eta, identificativo);
        this.profondita = profondita;
    }

    public int getProfondita() {
        return profondita;
    }

    public void setProfondita(int profondita) {
        this.profondita = profondita;
    }

    @Override
    public void stampa() {
        System.out.println("eta : " + getEta() + ", identificativo : " + getIdentificativo() + ", profondità : " + getProfondita());
    }
}
