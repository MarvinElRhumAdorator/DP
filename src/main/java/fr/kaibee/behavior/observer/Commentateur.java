package fr.kaibee.behavior.observer;

public class Commentateur {
    static int idProvider;

    private int id;

    public Commentateur() {
        id = ++idProvider;
    }

    public void commente(Compteur compteur) {
        System.out.println("Waouh  " + compteur.getCount() + " is amazing");
    }
}
