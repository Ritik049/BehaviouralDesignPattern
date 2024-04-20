public class Client{

    public static void main(String[]args)
    {  Kitchen kitchen = new Kitchen();
        BurgerOrder burger = new BurgerOrder(kitchen);      //command need to given to reciver.
        PizzaOrder pizza = new PizzaOrder(kitchen);

        Waiter waiter = new Waiter();                        //invoker.

        waiter.takeOrder(burger);                           //doing queue operations
        waiter.takeOrder(pizza);

        waiter.placeOrder();                              //delegating  the command to reciever;
    }
}