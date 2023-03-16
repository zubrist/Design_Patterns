public class ClientDemo {
    
    public static void main(String[] args) {
        WidgetFactory wdf = FactoryProducer.getDesign(false);

        Design design = wdf.getDesign("Window");
        design.make();

        Design design2 = wdf.getDesign("ScrollBar");
        design2.make();
        
    }
}
