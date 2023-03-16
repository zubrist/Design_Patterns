public class PizzaDema {
    
public static  void main(String  []args){

    PizzaFactory factory = new PizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    Pizza pizza=store.orderPizza("cheese");

    
    System.out.println("Your order of "+ pizza.getName() +" has been send...\n");
    
}
}