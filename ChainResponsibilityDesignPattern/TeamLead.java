public class TeamLead implements handlerInterface
{
    private final int  amount = 1000;
    handlerInterface nextHandler;

    public TeamLead()
    {
        
    }
    
    public void setNextHandler(handlerInterface nextHandler)
    {
        this.nextHandler = nextHandler;
    }
   
    public void handleExpense(ExpenseReport report)
    {
        if(report.getAmount()<=amount)
        {
            System.out.println("Expense report is approved for "+ report.getAmount());
        }
        else
        {
            nextHandler.handleExpense(report);
        }
    }


    
}