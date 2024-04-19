public class Client
{ //Here we make  interpret function in  expression itself to avoid using interface and expression class again and again,
    public static void main(String[]args)
    {
        AddExpression expression = new AddExpression(new NumberExpression(10),new SubtractExpression(new NumberExpression(20),new NumberExpression(5)));
        System.out.println( expression.interpret());
    }
}