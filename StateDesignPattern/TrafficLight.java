public class TrafficLight
{
    private TrafficLightState currentState;

    public TrafficLight()
    {
        currentState = new RedState();
    }

    public void setState(TrafficLightState state)
    {
        this.currentState = state;
    }

    //Method to switch the state of the traffic light
    public void changeState()
    {
        if(currentState instanceof RedState)
        {
            setState(new GreenState());
        }

        else if(currentState instanceof GreenState)
        {
            setState(new YellowState());
        }
        else if(currentState instanceof YellowState)
        {
            setState(new RedState());
        }
    }
    public void request()
    {
        currentState.handleRequest();
    }

}