package ObserverDesgnPattern;

public class OctalObserver implements Observer, DisplayElement {
    private Subject decimalSubject;
    private int decimalValue;
    
    public OctalObserver(Subject decimalSubject) {
     this.decimalSubject = decimalSubject;
     decimalSubject.registerObserver(this);
    }
    
    @Override
    public void update() {
     DecimalData decimalData = null;
     if (decimalSubject instanceof DecimalData) {
      decimalData = (DecimalData) decimalSubject;
      decimalValue = decimalData.getDecimalValue();
     }
     display();
    }
    
    /*
     * The display() method just prints out the most recent decimal value in
     * octal.
     */
    @Override
    public void display() {
     System.out.println("Octal String: "
       + Integer.toOctalString(decimalValue));
    }
   }
