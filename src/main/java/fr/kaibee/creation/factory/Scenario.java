package fr.kaibee.creation.factory;

import fr.kaibee.creation.builder.Person;

public class Scenario {
    public void journey(Coordinate arrival, Person person, String type) {
        Vehicule vehicule = createVehicule(type);
        vehicule.carry(person, arrival);
    }

    protected Vehicule createVehicule(String type) {
        Vehicule vehicule;
        if (type == "heavy") {
            vehicule = new Truck();
        } else {
            vehicule = new Car();
        }
        return vehicule;
    }

}

