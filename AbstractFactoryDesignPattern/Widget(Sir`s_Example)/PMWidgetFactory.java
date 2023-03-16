public class PMWidgetFactory implements WidgetFactory{

    @Override
    public Design getDesign(String designType) {
        Design design=null;
       
    //    if(designType==null){
    //     return null;
        
    //    }
       if(designType.equalsIgnoreCase("Window"))
          design= new PMWindows();

       else if (designType.equalsIgnoreCase("ScrollBar"))
           design=  new  PMScrollBar();

    return design;
    }
    
}
