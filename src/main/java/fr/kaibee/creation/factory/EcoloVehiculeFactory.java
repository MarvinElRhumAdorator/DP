package fr.kaibee.creation.factory;

public class EcoloVehiculeFactory extends VehiculeFactory {
    @Override
    public Vehicule getVehicule(String type) {
        return new Bike();
    }

}
