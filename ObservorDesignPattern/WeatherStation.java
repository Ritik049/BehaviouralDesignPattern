import java.util.*;
public class WeatherStation implements Subject{

    private List<Observor>observors;
    private int temperature;

    public WeatherStation()
    {
        this.observors = new ArrayList<>();
    }

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
        notifyObservor();
    }


    public void notifyObservor()
    {
        for(Observor observor: observors)
        {
            observor.update(this.temperature);
        }
    }

    @Override
    public void registerObservor (Observor observor)
    {
        observors.add(observor);
    }

    @Override
    public void unregisterObservor(Observor observor)
    {
        observors.remove(observor);
    }

   
   

}