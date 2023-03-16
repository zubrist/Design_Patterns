package FactoryDesignPattern.PizzaStore2;

public class PizzaStore {

    PizzaFactory factory = new PizzaFactory();

    public PizzaStore (PizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String style, String type){
        Pizza pizza;

        pizza= factory.createPizza(style, type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    
}
