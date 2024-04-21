public class Client
{
    public static void main(String[]args)
    {   
        AirTrafficController mediator = new AirTrafficController();
        AirCraftInterface airPlane1 = new AirPlane(mediator, "airPlane1");
        AirCraftInterface airPlane2 = new AirPlane(mediator,"airPlane2");
        AirCraftInterface airPlane3 = new AirPlane(mediator,"airPlane3");

        airPlane1.sendPosition(100);
        airPlane2.sendPosition(150);
        airPlane3.sendPosition(500);

    }
}