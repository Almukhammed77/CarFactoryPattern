package carfactory.abstractfactory;

public class EconomyTransmission implements Transmission {
    @Override
    public String getType() {
        return "5-Speed Manual";
    }
}