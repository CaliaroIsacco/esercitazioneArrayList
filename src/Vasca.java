import java.util.ArrayList;

public class Vasca {

    private String nome;
    private ArrayList<Esemplare> esemplari = new ArrayList<>();

    public Vasca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inserisci(Esemplare esemplare){
        esemplari.add(esemplare);
    }

    public void stampa(){
        for (int x = 0; x < esemplari.size(); x++){
            esemplari.get(x).stampa();
        }
    }

    public void remove(int posizione){
        if (posizione > esemplari.size()){
            return;
        }
        esemplari.remove(posizione - 1);
    }
}
