public class Client{
    public static void main(String[]args)
    {
        int[]array = {7,3,4,9,2};
        SortingContext context = new SortingContext();
        
      

        //Use Quick Sort strategy
        context.setStrategy(new QuickSort());
        context.sortArray(array);

        //   //Use bubble sort strategy.
        // context.setStrategy(new BubbleSort());                               //E
        // context.sortArray(array);
    }
}