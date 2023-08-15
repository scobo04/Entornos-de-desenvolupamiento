package builder;

public class Director {
    public void suv (Builder builder) {
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATICO);
        builder.setGPSNavigator(true);
        builder.setCarType(CarType.SUV);
        builder.setTripComputer("XJ44");
        Engine engine = new Engine(2.0, 0,true);
        builder.setEngine(engine);
    }

    public void sport (Builder builder) {
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATICO);
        builder.setGPSNavigator(true);
        builder.setCarType(CarType.SPORT);
        builder.setTripComputer("XJ43");
        Engine engine = new Engine(2.0, 0,true);
        builder.setEngine(engine);
    }
}
