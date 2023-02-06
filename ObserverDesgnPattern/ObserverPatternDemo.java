package ObserverDesgnPattern;

import java.util.Scanner;

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
    
     // Input Decimal Value
     System.out.println("Enter A decimal value:");

    Scanner sc = new Scanner(System.in);

    int number= sc.nextInt();
    System.out.println("Decimal String:" +number);
     decimalData.setDecimalValue(number);

     System.out.println("Enter A decimal value:");
     int newNumber = sc.nextInt();
     System.out.println("\nNow, Data is changed.\n");
     // Now, new decimal value
     System.out.println("Decimal String:" +newNumber);
     decimalData.setDecimalValue(newNumber);
    
    }
   }