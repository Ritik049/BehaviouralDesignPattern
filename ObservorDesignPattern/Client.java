public class Client{
   
   public static void main(String[]args)
   {
      Observor display = new Display();
      Observor mobile = new MobileApp();

      WeatherStation weatherStation = new WeatherStation();

      weatherStation.registerObservor(display);
      weatherStation.registerObservor(mobile);

      weatherStation.setTemperature(100); 


          
    }
}