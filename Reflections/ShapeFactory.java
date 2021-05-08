import java.lang.reflect.*;
public class ShapeFactory {
// use getShape method to get object of type shape
    public Shape getShape(String shapeType) throws Exception {
        if (shapeType == null) {
            return null;
        }
        // if (shapeType.equalsIgnoreCase("Circle")) {
        //     return new Circle();
        // } else if (shapeType.equalsIgnoreCase("Rectangle")) {
        //     return new Rectangle();
        // }
        Class c = Class.forName(shapeType);
        Shape s = (Shape) c.newInstance();
        return s;
    }
}