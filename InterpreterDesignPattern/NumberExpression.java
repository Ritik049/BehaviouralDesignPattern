public class NumberExpression implements InterfaceExpression
{  
    int num;
    public NumberExpression(int num)
    {
        this.num = num;
    }

    public int interpret()
    {
        return num;
    }
}