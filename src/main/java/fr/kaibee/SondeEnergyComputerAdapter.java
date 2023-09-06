package fr.kaibee;

import fr.kaibee.creation.builder.Person;
import fr.kaibee.creation.singleton.MomoSingleton;
import fr.kaibee.structural.decorator.AccurateEnergyComputer;
import fr.kaibee.structural.decorator.EnergyComputer;

public class SondeEnergyComputerAdapter implements Sonde {


    private EnergyComputer energyComputer;

    public SondeEnergyComputerAdapter(EnergyComputer energyComputer) {
        this.energyComputer = energyComputer;
    }

    @Override
    public void calculate(int quantity) {
        double v = mapTo(quantity);
        System.out.println("v = " + v);
    }

    private double mapTo(int quantity) {
        return energyComputer.computeEnergy(quantity + "");
    }
}
