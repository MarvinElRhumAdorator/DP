package fr.kaibee.structural.decorator;

public class AccurateEnergyComputer implements EnergyComputer {
    @Override
    public double computeEnergy(String quantity) {

        //         logic here
        return 98.7d;
    }
}
