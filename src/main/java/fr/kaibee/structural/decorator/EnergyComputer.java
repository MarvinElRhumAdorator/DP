package fr.kaibee.structural.decorator;

public interface EnergyComputer {
    double computeEnergy(String quantity);

    static EnergyComputer accurateEnergyComputer() {
        return new AccurateEnergyComputer();
    }

    static EnergyComputer roundedEnergyComputer() {
        return new RoundedDecorator(new AccurateEnergyComputer());
    }
}
