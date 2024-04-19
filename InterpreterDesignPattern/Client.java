public class Client
{
    public static void main(String[]args)
    {
        AddExpression expression = new AddExpression(new NumberExpression(10),new SubtractExpression(new NumberExpression(20),new NumberExpression(5)));
        System.out.println( expression.interpret());
    }
}