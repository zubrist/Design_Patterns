package AbstractFactoryDesignPattern.Shape;

public class FactoryProducer {

    public static AbstractFactory getFactory( boolean red){
        if(red){
            return new RedFactory();
        }
        else{
            return new BlueFactory();
                }
    }
    
}
