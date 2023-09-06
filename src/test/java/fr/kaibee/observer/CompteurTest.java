package fr.kaibee.observer;

import fr.kaibee.behavior.observer.Commentateur;
import fr.kaibee.behavior.observer.Compteur;
import fr.kaibee.behavior.observer.GrognonCommentateur;
import org.junit.jupiter.api.Test;

class CompteurTest {
    @Test
    void name() {
        Compteur compteur = new Compteur();
        compteur.subscribe(new Commentateur());
        compteur.subscribe(new GrognonCommentateur());
        compteur.subscribe(new Commentateur());

        compteur.increment();
        compteur.increment();
    }
}
