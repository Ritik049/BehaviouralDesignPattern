public class MobileApp implements Observor{
   
   @Override
   public void update(int temperature)
   {
    System.out.println("Mobile App: Temperature is now "+temperature + "C");
   }
}