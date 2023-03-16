public class FactoryProducer {
    
    public static WidgetFactory getDesign( boolean pm){
        if(pm){
            return new PMWidgetFactory() ;
        }
        else {
            return new motifWidgetFactory();
        }
    }
}
