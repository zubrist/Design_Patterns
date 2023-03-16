public class motifWidgetFactory implements WidgetFactory{

    @Override
    public Design getDesign(String designType) {
        Design design= null;
        if(designType==null){
            return null;
        }

        if(designType.equalsIgnoreCase("Windows"))
            design= new MotifWindows();
         
        else if(designType.equalsIgnoreCase("ScrollBar"))  
            design= new MotifScrollBar() ;

        return design; 
    }
        

    
}
