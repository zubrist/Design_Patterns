package FactoryDesignPattern.PizzaStore2;

abstract  public class Pizza {

    String name;
    String style;
    String type;
    

    public String getName(){
        return name;
    }

    public void prepare(){
        System.out.println("Preparing..."+name);
    }

    public void bake(){
        System.out.println("baking..."+name);
    }
    public void cut(){
        System.out.println("Cuttinng ...."+name);

    }
    public void box(){
        System.out.println("Boxing ..."+name);
    }
}
