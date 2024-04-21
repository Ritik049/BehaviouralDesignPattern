import java.util.*;
public class TaskIterator implements Iterator<Task>
{
    private int index;
    private List<Task>tasks;
    //private TaskList tasks;

    public TaskIterator(List<Task> tasks)
    {
        this.index = 0;
        this.tasks = tasks;
    }
   
   @Override
    public boolean hasNext()
    {
        return index < tasks.size();
    }
     
    @Override
    public Task next()
    {
        if(!hasNext())
        {
            throw new IllegalStateException("No more tasks to iterate over");
        }
       Task task = tasks.get(index);
       index++;
       return task;
    }
}