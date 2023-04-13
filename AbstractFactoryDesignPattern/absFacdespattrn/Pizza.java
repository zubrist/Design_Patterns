

abstract  public class Pizza {

    String name;
    String type;
    String style;   

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

class ChickenPizza extends Pizza{

    public ChickenPizza(){
        name=" Chicken Pizza";
        type= "Chicken";
    }
}

class PaneerPizza extends Pizza{

    public PaneerPizza(){
        name="Paneer Pizza";
        type= "Paneer";
    }
}

class CornPizza extends Pizza{

    public CornPizza(){
        name= "Corn Pizza";
        type= "Corn";
    }
}

 class AmericanChickenPizza extends Pizza{
    
    public  AmericanChickenPizza(){
    name="American Chicken Pizza";
    style="American";
    type="Chicken";
    }
 }

  class AmericanPaneerPizza extends Pizza{
    
    public  AmericanPaneerPizza(){
    name="American Paneer Pizza";
    style="American";
    type="Paneer";
    }
 }
  class AmericanCornPizza extends Pizza{
    
    public  AmericanCornPizza(){
    name="American Corn Pizza";
    style="American";
    type="Corn";
    }
 }

 class SouthIndianChickenPizza extends Pizza{
    
    public  SouthIndianChickenPizza(){
    name="South Indian Chicken Pizza";
    style="South Indain";
    type="Chicken";
    }
 }

  class SouthIndianPaneerPizza extends Pizza{
    
    public  SouthIndianPaneerPizza(){
    name="South Indain Paneer Pizza";
    style="South Indian";
    type="Paneer";
    }
 }
  class SouthIndianCornPizza extends Pizza{
    
    public  SouthIndianCornPizza(){
    name="South Indian Corn Pizza";
    style="South Indian";
    type="Corn";
    }
 }

 class NorthIndianChickenPizza extends Pizza{
    
    public  NorthIndianChickenPizza(){
    name="North Indian Chicken Pizza";
    style="North Indain";
    type="Chicken";
    }
 }

  class NorthIndianPaneerPizza extends Pizza{
    
    public  NorthIndianPaneerPizza(){
    name="North Indain Paneer Pizza";
    style="North Indian";
    type="Paneer";
    }
 }
  class NorthIndianCornPizza extends Pizza{
    
    public  NorthIndianCornPizza(){
    name="North Indian Corn Pizza";
    style="North Indian";
    type="Corn";
    }
 }