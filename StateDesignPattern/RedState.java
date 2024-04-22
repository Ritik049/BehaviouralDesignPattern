public class RedState implements TrafficLightState
{
    @Override
    public void handleRequest()
    {
        System.out.println("Turning RED Lights on.....");
    }
}