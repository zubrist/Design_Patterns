package FactoryDesignPattern.PizzaStore2;

public class PizzaFactory {

    public Pizza createPizza(String style, String type){
        
        Pizza pizza=null;

        if(style.equalsIgnoreCase("American"))
        {
            if(type.equalsIgnoreCase("Chicken"))
            pizza = new AmericanChickenPizza();
        }

        if(style.equalsIgnoreCase("American")){
            if(type.equals("Paneer"))
                pizza = new AmericanPaneerPizza();
        }

        if (style.equalsIgnoreCase("American"))
            if(type.equals("NA")){
            pizza =new AmericanPizza();}


        return pizza;
        
    }
    
}
