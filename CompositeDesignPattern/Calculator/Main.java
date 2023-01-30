package CompositeDesignPattern.Calculator;

public class Main {
    public static void main(String[] args) {
        Number two = new Number(2);
        Number one = new Number (1);
        Number seven= new Number(7);

        Expression addExpression= new Expression(one, seven, Operation.ADD);

        Expression mulExpression= new Expression(two, addExpression, Operation.MULTIPLY);
        System.out.println(mulExpression.calculate());
    }
    
}
