package builder;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;


    public Engine(double volume, double mileage, boolean started) {
        this.volume = volume;
        this.mileage = mileage;
        this.started = started;
    }
}
