package builder;

public class Car {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private String tripComputer;
    private boolean hasGPS;


    public Car(CarType type, int seats, Engine engine, Transmission transmission,
               String tripComputer, boolean hasGPS) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.hasGPS = hasGPS;
    }

    public CarType getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }
}
