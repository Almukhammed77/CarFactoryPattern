package carfactory.abstractfactory;

public class CarAssembler {
    public static void assemble(CarFactoryAbstract factory) {
        Engine engine = factory.createEngine();
        Transmission transmission = factory.createTransmission();
        Interior interior = factory.createInterior();

        System.out.println("Assembling car with:");
        System.out.println("Engine: " + engine.getType());
        System.out.println("Transmission: " + transmission.getType());
        System.out.println("Interior: " + interior.getStyle());
    }
}
