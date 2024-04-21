public class AirPlane implements AirCraftInterface{
    private  ATCMediator mediator;
    private String name;
    private int position;

    public AirPlane(ATCMediator mediator, String name)
    {
        this.mediator = mediator;
        this.name = name;
        this.position = 0;
        this.mediator.registerAircraft(this);
    }

    @Override
    public void sendPosition(int position)
    {
        this.position = position;
        mediator.sendPosition(this,position);
    }

    @Override
    public int getPosition()
    {
        return position;
    }

    @Override
    public String getName()
    {
        return name;
    }
}