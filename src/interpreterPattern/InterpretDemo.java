package interpreterPattern;

public class InterpretDemo {
    public static void main(String[] args){
        Expression five = new NumberExpression(5);
        Expression ten = new NumberExpression(10);
        Expression fifteen = new NumberExpression(15);
        Expression twenty = new NumberExpression(20);

        AddExpression expression = new AddExpression(five,ten);
        SubtractExpression expression2 = new SubtractExpression(twenty,fifteen);
        System.out.println(expression2);
        System.out.println(expression);
        System.out.println(expression.interpret());
        System.out.println(expression2.interpret());
    }
}
