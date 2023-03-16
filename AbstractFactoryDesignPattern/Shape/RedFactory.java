package AbstractFactoryDesignPattern.Shape;

public class RedFactory implements AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        

            Shape shape =null;
            if (shapeType==null){
                return null;
            }
            if( shapeType.equalsIgnoreCase("CIRCLE"))
                shape= new RedCircle();
            
            if(shapeType.equalsIgnoreCase("RECTANGLE"))
                shape = new RedRectangle();
            if (shapeType.equalsIgnoreCase("SQUARE"))
                shape = new RedSquare();   
                
              return shape; 
    }


    
}

