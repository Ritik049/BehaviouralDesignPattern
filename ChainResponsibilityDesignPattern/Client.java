public class Client
{
  //Pros and cons and general
  //User not know exactly at how many stages it need to pass,
  //As we are using setNextHandlers function so we can change them otherwise we can send them via constructor argument.
  //Here Remember we need to make Interface with Eventhandler handlingFunction that particular request application object.
  //At Client.java our code start from Ist handler , if we write setNextHandlers in other class, so user need not to worry 
  //He just need to use firstHandler and use Interface function , not send report as arguement,as if we do this, we need to handle every handler accordingly and structure will become mismanaged.
  

    public static void main(String[]args)
    {
        ExpenseReport report1 = new ExpenseReport("Rohan",7000);
        ExpenseReport report2 = new ExpenseReport("Ritik",10000000);
        ExpenseReport report3 = new ExpenseReport("Rishi", 100);

        // handlerInterface teamLead = new TeamLead();
        // handlerInterface manager = new Manager();
        // handlerInterface director = new Director();     //Here we not passing nextHandler in argument itself although it can be pass.

        TeamLead teamLead = new TeamLead();     //Interface has not function of setNextHandler
        Manager manager = new Manager();
        Director director = new Director(); 

        teamLead.setNextHandler(manager);
        manager.setNextHandler(director);

        teamLead.handleExpense(report1);
        teamLead.handleExpense(report2);
        teamLead.handleExpense(report3);

    }
}