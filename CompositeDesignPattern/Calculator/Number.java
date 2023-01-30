package CompositeDesignPattern.Calculator;

public class Number implements ArithmeticExpression {
    int value;

    public Number (int Number){
        this.value=Number;
    }


    public int calculate(){
        System.out.println("The num is:" +value);
        return value;
    }
    
}
