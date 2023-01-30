public class clint {
    public static void main(String[] args) {

Shape rectangle = new Rectangle();
Shape circle = new Circle();
rectangle.draw(); //Drawing a rectangle
circle.draw(); //Drawing a circle

CompositeShape compositeShape = new CompositeShape();
compositeShape.addShape(rectangle);
compositeShape.addShape(circle);
compositeShape.removeShape(rectangle);
compositeShape.draw(); //Drawing a rectangle\nDrawing a circle
    }
}
