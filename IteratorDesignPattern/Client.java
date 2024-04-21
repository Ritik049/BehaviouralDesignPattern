import java.util.*;
public class Client
{
    public static void main(String []args)    
{    
    TaskList tasks = new TaskList();
    tasks.addTask(new Task("Complete Java Project"));
    tasks.addTask(new Task("Write report"));
    tasks.addTask(new Task("Prepare Representation"));

    //Iterate 
    Iterator<Task> iterator = tasks.iterator();

    while(iterator.hasNext())
    {
        Task task = iterator.next();
        System.out.println("Task "+task.getName());
    }
    
    }
}