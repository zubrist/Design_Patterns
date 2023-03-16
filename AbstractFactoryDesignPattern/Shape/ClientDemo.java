package AbstractFactoryDesignPattern.Shape;

public class ClientDemo {

    public static void main(String[] args) {
        AbstractFactory blueFactory = FactoryProducer.getFactory(false);

        Shape shape = blueFactory.getShape("Circle");
        shape.draw();

        Shape shape2 =blueFactory.getShape(("Square"));
        shape2.draw();

        AbstractFactory redFactory = FactoryProducer.getFactory(true);

        Shape shape3 = redFactory.getShape("Circle");
        shape3.draw();
        
        Shape shape4 = redFactory.getShape("Square");
        shape4.draw();
    }
    
}
