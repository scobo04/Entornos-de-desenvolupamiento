package factory;

public class CircleFactory extends ShapeFactory {
    @Override
    protected Shape createShape() {
        return new Circle();
    }
}
