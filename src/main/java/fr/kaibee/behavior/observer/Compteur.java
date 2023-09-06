package fr.kaibee.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Compteur {
    private int count;
    private List<Commentateur> commentateurs = new ArrayList<>();

    public void increment() {
        count++;
        notifyAllCommentateurs();
    }

    public void subscribe(Commentateur commentateur) {
        commentateurs.add(commentateur);
    }

    protected void notifyAllCommentateurs() {
        for (Commentateur commentateur : commentateurs) {
            commentateur.commente(this);
        }
    }

    public int getCount() {
        return count;
    }
}
