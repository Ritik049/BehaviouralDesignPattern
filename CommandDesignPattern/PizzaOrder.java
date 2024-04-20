public class PizzaOrder implements OrderInterface
{
    Kitchen kitchen ;
    
    public PizzaOrder(Kitchen kitchen)
    {
        this.kitchen= kitchen;
    }

    public void execute()
    {
        kitchen.preparePizza();
    }
}
