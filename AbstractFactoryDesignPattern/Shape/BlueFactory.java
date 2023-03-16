package AbstractFactoryDesignPattern.Shape;



public class BlueFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        Shape shape =null;
        if (shapeType==null){
            return null;
        }
        if( shapeType.equalsIgnoreCase("CIRCLE"))
            shape= new BLueCircle();
        
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
            shape = new BlueRectangle();
        if (shapeType.equalsIgnoreCase("SQUARE"))
            shape = new BlueSquare();   
            
          return shape;  

}
}
