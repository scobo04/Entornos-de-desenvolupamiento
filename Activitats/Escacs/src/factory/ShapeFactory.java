package factory;

public abstract class ShapeFactory {
    public Shape create() {
        Shape shape = createShape();
        // INICIALITZAR TOTES LES PEÇES
        // Peca rei = new Rei(builder...9
        shape.draw();

        return shape;
    }

    /*public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }*/

    protected abstract Shape createShape();



}
