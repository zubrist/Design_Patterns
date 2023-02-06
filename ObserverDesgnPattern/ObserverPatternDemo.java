package ObserverDesgnPattern;

public class ObserverPatternDemo {
 
    public static void main(String[] args) {
     // First, create the DecimalData object.
     DecimalData decimalData = new DecimalData();
    
     /*
      * Create the three format Object and pass them the DecimalData object.
      */
    
     BinaryObserver binaryObserver = new BinaryObserver(decimalData);
     OctalObserver octalObserver = new OctalObserver(decimalData);
     HexObserver hexObserver = new HexObserver(decimalData);
    
     // set Decimal Value
     decimalData.setDecimalValue(24);
     System.out.println("\nNow, Data is changed.\n");
     // Now, new decimal value
     decimalData.setDecimalValue(124);
    
    }
   }