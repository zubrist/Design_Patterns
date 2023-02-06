package ObserverDesignPatter;


    public class BinaryObserver implements Observer, DisplayElement {
        private Subject decimalSubject;
        private int decimalValue;
        
        public BinaryObserver(Subject decimalSubject) {
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
         * binary.
         */
        @Override
        public void display() {
         System.out.println("Binary String: "
           + Integer.toBinaryString(decimalValue));
        } 
    
}
