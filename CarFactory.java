package carfactory.factory;

public class CarFactory {
    public static Car createCar(String type) {
        return switch (type.toLowerCase()) {
            case "sedan" -> new Sedan();
            case "suv" -> new SUV();
            case "sports" -> new SportsCar();
            default -> throw new IllegalArgumentException("Unknown car type: " + type);
        };
    }
}