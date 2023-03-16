

public class PizzaFactory {
    
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese"))
            pizza= new CheesePizza();
        else if (type.equals("Pepperoni"))
            pizza= new PepperoniPizza();    
        else if (type.equals("Veggie"))
            pizza=new PepperoniPizza();
        return pizza;
    }
  

        
    }
    
    

