public class SubtractExpression implements InterfaceExpression
{
    InterfaceExpression expression1;
    InterfaceExpression expression2;

    public SubtractExpression(InterfaceExpression expression1, InterfaceExpression expression2)
    {
        this.expression1  = expression1;
        this.expression2 = expression2;
    }
    public int interpret()
    {
        return expression1.interpret()- expression2.interpret();
    }
}