import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int profondita = 0;
        int periodoGestazione = 0;
        int scelta;
        int stampare = 0;
        int vasca = 0;
        int voce;

        Vasca vasca1 = new Vasca("vasca1");
        Vasca vasca2 = new Vasca("vasca2");

        do{
            System.out.println("1 --> inserire nuovo esemplare");
            System.out.println("2 --> stampa");
            System.out.println("3 --> elimina");
            System.out.println("0 --> esci");

            System.out.println("scegli una voce");
            voce = in.nextInt();

            switch (voce){
                case 1:
                    System.out.println("In quale vasca di vuole inserire un nuovo esemplare??");
                    scelta = in.nextInt();
                    System.out.println("Inserire tipo di esemplare: 1 = pesce, 2 = mammifero");
                    int tipo = in.nextInt();
                    System.out.println("Inserire identificativo");
                    in.nextLine();  // Consume newline left-over
                    String idetificativo = in.nextLine();
                    System.out.println("Inserire età");
                    int eta = in.nextInt();

                    if (tipo == 1){
                        System.out.println("Inserire a che profondità il pesce vive");
                        profondita = in.nextInt();
                    } else {
                        System.out.println("Inserire periodo di gestazione");
                        periodoGestazione = in.nextInt();
                    }

                    Esemplare esemplare;
                    if (tipo == 1){
                        esemplare = new Pesce(eta, idetificativo, profondita);
                    } else {
                        esemplare = new Mammifero(eta, idetificativo, periodoGestazione);
                    }

                    if (scelta == 1){
                        vasca1.inserisci(esemplare);
                    } else if (scelta == 2){
                        vasca2.inserisci(esemplare);
                    }
                    break;

                case 2:
                    System.out.println("di quale vasca si vuole la stampa??");
                    scelta = in.nextInt();
                    if (scelta == 1){
                        vasca1.stampa();
                    } else if (scelta == 2){
                        vasca2.stampa();
                    }
                    break;

                case 3:
                    System.out.println("in quale vasce è l'elemento da eliminare??");
                    scelta = in.nextInt();
                    if (scelta == 1){
                        vasca1.stampa();
                    } else if (scelta == 2){
                        vasca2.stampa();
                    }

                    System.out.println("Inserire la posizione dell'elemento da eliminare");
                    int posizione = in.nextInt();
                    if (scelta == 1){
                        vasca1.remove(posizione);
                    } else if (scelta == 2){
                        vasca2.remove(posizione);
                    }

                    break;
                case 0:
                    break;
            }


        } while(voce != 0);



    }
}