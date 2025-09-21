package carfactory.abstractfactory;

public class EconomyCarFactory implements CarFactoryAbstract {
    public Engine createEngine() {
        return new EconomyEngine();
    }

    public Transmission createTransmission() {
        return new EconomyTransmission();
    }

    public Interior createInterior() {
        return new EconomyInterior();
    }
}
