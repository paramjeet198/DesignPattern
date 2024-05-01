package factory.shape;

import factory.shape.factory.ShapeFactory;
import factory.shape.factory.ShapeType;
import factory.shape.shapes.Shape;

public class Client {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape(ShapeType.SQUARE);
        shape.draw();

    }
}
