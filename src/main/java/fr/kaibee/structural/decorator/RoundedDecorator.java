package fr.kaibee.structural.decorator;

public class RoundedDecorator implements EnergyComputer {
    private EnergyComputer target;

    public RoundedDecorator(EnergyComputer energyComputer) {
        this.target = energyComputer;
    }

    @Override
    public double computeEnergy(String quantity) {
        double res = target.computeEnergy("0");
        return Math.ceil(res);
    }
}
