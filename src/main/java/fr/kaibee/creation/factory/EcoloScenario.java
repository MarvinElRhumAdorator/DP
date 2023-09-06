package fr.kaibee.creation.factory;

import fr.kaibee.creation.factory.Bike;
import fr.kaibee.creation.factory.Scenario;
import fr.kaibee.creation.factory.Vehicule;

public class EcoloScenario extends Scenario {
    @Override
    protected Vehicule createVehicule(String type) {
        return new Bike();
    }
}
