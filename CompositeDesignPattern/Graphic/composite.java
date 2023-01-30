import java.util.ArrayList;
import java.util.List;

class CompositeShape implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

/*In this example, Shape is the component interface, and Rectangle and Circle are leaf objects that 
implement the Shape interface. CompositeShape is a composite object that also implements 
the Shape interface and has an interface for managing its children (shapes). */