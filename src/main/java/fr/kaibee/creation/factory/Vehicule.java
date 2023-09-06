package fr.kaibee.creation.factory;

import fr.kaibee.creation.builder.Person;

public class Vehicule {
    public void carry(Person perso, Coordinate arrival) {
        System.out.println("perso = " + perso + ", arrival = " + arrival);
    }
}
