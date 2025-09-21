package carfactory;

import carfactory.abstractfactory.CarAssembler;
import carfactory.abstractfactory.EconomyCarFactory;
import carfactory.abstractfactory.LuxuryCarFactory;
import carfactory.factory.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("sedan");
        car1.drive();

        Car car2 = CarFactory.createCar("suv");
        car2.drive();

        Car car3 = CarFactory.createCar("sports");
        car3.drive();

        System.out.println("\n--- Abstract Factory ---");

        // Abstract Factory
        System.out.println("Luxury Car:");
        CarAssembler.assemble(new LuxuryCarFactory());

        System.out.println("\nEconomy Car:");
        CarAssembler.assemble(new EconomyCarFactory());
    }
}