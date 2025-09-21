package carfactory.abstractfactory;

public class LuxuryCarFactory implements CarFactoryAbstract {
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    public Transmission createTransmission() {
        return new LuxuryTransmission();
    }

    public Interior createInterior() {
        return new LuxuryInterior();
    }
}