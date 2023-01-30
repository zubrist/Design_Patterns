package CompositeDesignPattern.Calculator;

public class Expression implements ArithmeticExpression {

    ArithmeticException leftExpression;
    ArithmeticException rightExpression;
    Operation operation;

    public Expression(ArithmeticException leftPart, ArithmeticException rightPart, Operation operation){
        this.leftExpression =leftPart;
        this.rightExpression= rightPart;
        this.operation=operation;
    }



    public Expression(Number one, Number seven, Operation add) {
    }



    public Expression(Number two, Expression addExpression, Operation multiply) {
    }



    @Override
    public int calculate() {
        int value=0;
        switch(operation){
            case ADD:
            value=((ArithmeticExpression) leftExpression).calculate() + ((ArithmeticExpression) rightExpression).calculate();
            break;

            case SUBTRACT:
            value=((ArithmeticExpression) leftExpression).calculate() - ((ArithmeticExpression) rightExpression).calculate();
            break;

            case MULTIPLY:
            value=((ArithmeticExpression) leftExpression).calculate() * ((ArithmeticExpression) rightExpression).calculate();
            break;

            case DIVIDE:
            value=((ArithmeticExpression) leftExpression).calculate() / ((ArithmeticExpression) rightExpression).calculate();
            break;
        }
        System.out.println("Expression Value :"+value);
        return value;
    }
    
    
}
