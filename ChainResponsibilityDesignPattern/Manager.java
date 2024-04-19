public class Manager implements handlerInterface
{
    private final int amount = 10000;
    
    handlerInterface nextHandler;

    public Manager()
    {
        
    }

    public void setNextHandler (handlerInterface nextHandler)
    {
        this.nextHandler = nextHandler;

    }

    public void handleExpense(ExpenseReport report)
    {
        if(report.getAmount()<=amount)
        {
            System.out.println("Expense report is approved for "+report.getEmployeeName());
        }
        else{
            nextHandler.handleExpense(report);
        }
    }
}