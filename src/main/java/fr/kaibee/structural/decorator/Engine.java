package fr.kaibee.structural.decorator;

import fr.kaibee.Sonde;
import fr.kaibee.SondeEnergyComputerAdapter;

public class Engine {
    private Sonde sonde;

    public Engine(Sonde sonde) {
        this.sonde = sonde;
    }

    public void up() {

        //


        //
        int quantity = 100;
        sonde.calculate(100);
    }

    public static void main(String[] args) {
        Engine engine = new Engine(new SondeEnergyComputerAdapter(new AccurateEnergyComputer()));

        engine.up();

    }
}
