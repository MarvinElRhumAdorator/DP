package fr.kaibee.behavior.observer;

public class GrognonCommentateur extends Commentateur {
    @Override
    public void commente(Compteur compteur) {
        System.out.println("ça va tranquille c'est jsute " + compteur.getCount());
    }
}
