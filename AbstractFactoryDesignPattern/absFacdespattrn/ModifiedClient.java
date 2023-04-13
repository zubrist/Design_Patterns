public Class ModifiedClient {

     public static void main(String[] args) {
        
        PizzaFactory  factory = new PizzaFactory();
        PizzaStore  store = new PizzaStore(factory);

        Pizza  pizza  = store.orderPizza("Chicken", "American");


        System.out.println("Your "+pizza.getName()+ "has been shipped");

        

    }
}