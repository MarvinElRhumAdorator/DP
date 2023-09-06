package fr.kaibee.creation.factory;

import fr.kaibee.creation.builder.Person;

public class Car extends Vehicule {

    @Override
    public void carry(Person perso, Coordinate arrival) {
        System.out.println("Car is moving");
        super.carry(perso, arrival);
    }
}
