public class Client
{
    public static void main(String[]args)
    {
        TrafficLight trafficLight = new TrafficLight();

        //Initial State
        trafficLight.request();     //Output: Turning RED light on.....

        //Switch to the next state
        trafficLight.changeState();

        
        //Requeust the new State       this is showing a state.
        trafficLight.request();      //Output: Turning GReen light on.

    
        trafficLight.changeState();
    
        //Request the new state
        trafficLight.request();         //Output: Turning YELLOW light on....

          
          //Switch to the next state.
         trafficLight.changeState();
        

        //Request the new state
        trafficLight.request();            ///Showing the newly changed state.

        
    }


    //HERE the context class has mechansim of changing State as well as showing the state.
    
    //

}