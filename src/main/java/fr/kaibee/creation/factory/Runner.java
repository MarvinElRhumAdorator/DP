package fr.kaibee.creation.factory;

import fr.kaibee.creation.builder.Person;

public class Runner {
    public static void main(String[] args) {
        new RunnerTruck().extracted();

    }




    public void extracted() {
        System.out.println("il fait beau");
        Vehicule vehicule = getVehicule();
        vehicule.carry(getPerson(), new Coordinate(10, 10));
        System.out.println("vehicule = " + vehicule);
        // Others things
    }

    protected Vehicule getVehicule() {
        Vehicule vehicule;
        if (conditionExtern()) {
            vehicule = new Bike();
        } else {
            vehicule = new Car();
        }
        return vehicule;
    }

    private static boolean conditionExtern() {
        return false;
    }

    private static Person getPerson() {
        return null;
    }
}
