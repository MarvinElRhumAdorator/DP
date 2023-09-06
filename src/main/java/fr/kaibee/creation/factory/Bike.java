package fr.kaibee.creation.factory;

import fr.kaibee.creation.builder.Person;

public class Bike extends Vehicule {
    @Override
    public void carry(Person perso, Coordinate arrival) {
        System.out.println("Bike is moving");
        super.carry(perso, arrival);
    }
}
