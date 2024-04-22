public class Display implements Observor
{
    @Override
    public void update(int temperature)
    {
        System.out.println("Display Temperature is now "+temperature + "C");
    }

    
} 