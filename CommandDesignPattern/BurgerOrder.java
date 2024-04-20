public class BurgerOrder implements OrderInterface{
   
   Kitchen kitchen;
    public BurgerOrder(Kitchen kitchen)
    {
        this.kitchen = kitchen;
    }

    public void execute()
    {
        kitchen.prepareBurger();
    }
}