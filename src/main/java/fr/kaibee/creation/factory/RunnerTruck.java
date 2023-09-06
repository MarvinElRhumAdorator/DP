package fr.kaibee.creation.factory;

public class RunnerTruck extends Runner {
    @Override
    protected Vehicule getVehicule() {
        return new Truck();
    }
}
