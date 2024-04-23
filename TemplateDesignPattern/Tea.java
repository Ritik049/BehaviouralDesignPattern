public class  Tea extends Beverage
{
    @Override
    public void brew()
    {
        System.out.println("Stepping the tea");
    }

    public void addCondiments()
    {
        System.out.println("Adding lemon");
    }
}