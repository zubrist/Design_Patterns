
public class PizzaStore {

    PizzaFactory factory = new PizzaFactory();

    public PizzaStore (PizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(  String type){
        Pizza pizza;

        pizza= factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public Pizza orderPizza(  String type , String style){
        Pizza pizza;

        pizza= factory.createPizza(type,style);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    
}
