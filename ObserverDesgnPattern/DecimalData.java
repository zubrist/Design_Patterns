package ObserverDesignPatter;

 
import java.util.ArrayList;
import java.util.List;
 
public class DecimalData implements Subject {
 // ArrayList to hold the Observers, and we create it in the constructor.
 private List<Observer> observers;
 private int decimalValue;
 
 public DecimalData() {
  observers = new ArrayList<Observer>();
 }
 
 // When an observer registers, we just add it to the end of the list.
 @Override
 public void registerObserver(Observer o) {
  observers.add(o);
 }
 
 // when an observer wants to unregister, we just take it off the list.
 @Override
 public void removeObserver(Observer o) {
  int index = observers.indexOf(o);
  if (index >= 0) {
   observers.remove(index);
  }
 }
 
 /*
  * tell all the observers about the state. Because they are all Observers,
  * we know they all implement update(), so we know how to notify them.
  */
 @Override
 public void notifyObserver() {
  for (Observer observer : observers) {
   observer.update();
  }
 }
 
 // notify the Observers when decimal value change , means sate of object
 // changed.
 public void valuesChanged() {
  notifyObserver();
 }
 
 public int getDecimalValue() {
  return decimalValue;
 }
 
 // we’re going to use this method to test our display elements
 public void setDecimalValue(int decimalValue) {
  this.decimalValue = decimalValue;
  valuesChanged();
 }
    
}
