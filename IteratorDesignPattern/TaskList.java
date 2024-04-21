import java.util.*;
public class TaskList implements Iterable<Task>
{
    private List<Task> tasks;
      
      public TaskList()
      {
        this.tasks = new ArrayList<>();
      }

      public void addTask(Task task)
      {
        tasks.add(task);
      }

      @Override
      public Iterator<Task> iterator()
      {
        return new TaskIterator(tasks);
      }

}