import java.util.ArrayList;

abstract public class Pizza {

    String name;
    String dough;
    String souce;
    ArrayList toppings = new ArrayList<>();



    public String getName(){
    return name;

}
    public void prepare(){
        System.out.println("Preparing... " +name);
    }

    public void bake(){
        System.out.println("Baking... "+name);
            }
    public  void cut(){
        System.out.println("Cutting... "+name);

    }
    public void box(){
        System.out.println("Boxing... "+name);
    }

    public String toString(){

        StringBuffer display = new StringBuffer();

        display.append("----" +name +"----\n");
        display.append(dough +"\n");
        display.append(souce+"\n");

        for(int i=1; i<toppings.size(); i++){
            display.append((String ) toppings.get(i));
        }
        return display.toString();
    }
}



