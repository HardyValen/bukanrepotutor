
// FactoryPatternDemo.java
public class FactoryPatternDemo {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape1 = shapeFactory.getShape("Circle");
            shape1.draw();
            Shape shape2 = shapeFactory.getShape("Rectangle");
            shape2.draw();
            Shape shape3 = shapeFactory.getShape("Square");
            shape3.draw();
    }
}