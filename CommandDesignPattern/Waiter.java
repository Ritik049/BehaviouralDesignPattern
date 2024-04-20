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