package carfactory.abstractfactory;

public interface CarFactoryAbstract {
    Engine createEngine();
    Transmission createTransmission();
    Interior createInterior();
}