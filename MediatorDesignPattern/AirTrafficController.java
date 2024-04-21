import java.util.*;
public  class AirTrafficController implements ATCMediator{
    private List<AirCraftInterface>aircraftList;

    public AirTrafficController()
    {
        this.aircraftList = new ArrayList<>();
    }

    @Override
    public void registerAircraft (AirCraftInterface aircraft)
    {
        aircraftList.add(aircraft);
    }

    @Override
    public void sendPosition(AirCraftInterface aircraft, int position)
    {
        for(AirCraftInterface other: aircraftList)
        {
            if(other!=aircraft && Math.abs(other.getPosition()-position)<100)
            {
                System.out.println("Warning : Aircraft "+aircraft.getName() + " and "+other.getName() + " are too close");
            }
        }
    }
}