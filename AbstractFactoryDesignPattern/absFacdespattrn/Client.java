public Class Client {

     public static void main(String[] args) {
        
        PizzaFactory  factory = new PizzaFactory();
        PizzaStore  store = new PizzaStore(factory);

        Pizza  pizza  = store.orderPizza("Chicken");


        System.out.println("Your "+pizza.getName()+ "has been shipped");

        // pizza  = store.orderPizza("American", "NA");

        // System.out.println("Your "+pizza.getName()+ " has been shipped");

    }
}