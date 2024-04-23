public class SortingContext
{
    private InterfaceStrategy strategy;

    public void setStrategy(InterfaceStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void sortArray(int[]array)
    {
        strategy.sort(array);
    }
}