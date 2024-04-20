import java.util.*;
public class Waiter
{
   private List<OrderInterface>orderList = new ArrayList<>();

   public void takeOrder(OrderInterface order)
   {
         orderList.add(order);
   }

   public void placeOrder()
   {
    for(OrderInterface order: orderList)
    {
        order.execute();            //It delegates the  command to appropriate reciver.
    }
   }
     
}

//Without command pattern:  kitchen.prepareBurger() -->request(delegate to reciever through sender without quuee);
//With command pattern: this command executed through waiter--> He delegates command to appropriate reciever with supporting queue operations.

