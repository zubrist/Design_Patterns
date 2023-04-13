public class PizzaFactory {


    public Pizza createPizza(String type){

        Pizza pizza=null;

        if(type.equalsIgnoreCase("Chicken"))
            pizza= new ChickenPizza();

        if(type.equalsIgnoreCase("Paneer")) 
            pizza = new PaneerPizza();

        else if( type.equalsIgnoreCase("Corn"))
            pizza= new CornPizza(); 

            return pizza;      
    }

    public Pizza createPizza(String type, String style){
        
        Pizza pizza=null;
    // For American Pizzas
        if(type.equalsIgnoreCase("Chicken"))
        {
            if(style.equalsIgnoreCase("Amirican"))
            pizza = new AmericanChickenPizza();
        }

        if(type.equalsIgnoreCase("Paneer")){
            if(style.equals("American"))
                pizza = new AmericanPaneerPizza();
        }
        if(type.equalsIgnoreCase("Corn")){
            if(style.equals("American"))
                pizza = new AmericanCornPizza();
        }

    // For South Indians Pizzas

     if(type.equalsIgnoreCase("Chicken"))
        {
            if(style.equalsIgnoreCase("South indian"))
            pizza = new SouthIndianChickenPizza();
        }

        if(type.equalsIgnoreCase("Paneer")){
            if(style.equals("South Indian"))
                pizza = new SouthIndianPaneerPizza();
        }
        if(type.equalsIgnoreCase("Corn")){
            if(style.equals("South Indian"))
                pizza = new SouthIndianCornPizza();
        }


        // For NorthIndian pizzas

        if(type.equalsIgnoreCase("Chicken"))
        {
            if(style.equalsIgnoreCase("North indian"))
            pizza = new NotrthIndianChickenPizza();
        }

        if(type.equalsIgnoreCase("Paneer")){
            if(style.equals("North Indian"))
                pizza = new NorthIndianPaneerPizza();
        }
        if(type.equalsIgnoreCase("Corn")){
            if(style.equals("North Indian"))
                pizza = new NorthIndianCornPizza();
        }



        


        return pizza;
        
    }
    
}