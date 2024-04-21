public interface ATCMediator{
    void registerAircraft(AirCraftInterface aircraft);
    void sendPosition(AirCraftInterface aircraft, int position);
}