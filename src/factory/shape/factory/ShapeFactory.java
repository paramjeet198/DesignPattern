package factory.shape.factory;

import factory.shape.shapes.Shape;
import factory.shape.shapes.Circle;
import factory.shape.shapes.Rectangle;
import factory.shape.shapes.Square;

public class ShapeFactory {

    public Shape createShape(String shapeType) {
        System.out.println("\n############ PLEASE WAIT - DRAWING SHAPE ###############\n");
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else {
            return null;
        }
    }

    public Shape createShape(ShapeType shapeType) {
        System.out.println("\n############ PLEASE WAIT - DRAWING SHAPE ###############\n");
        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else if (shapeType == ShapeType.SQUARE) {
            return new Square();
        } else if (shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
