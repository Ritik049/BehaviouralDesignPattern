public class Director implements handlerInterface
{
    private final int amount = 1000000;

    public Director()
    {
        
    }

    public void handleExpense(ExpenseReport report)
    {
        if(report.getAmount()<=amount)
        {
            System.out.println("Expense report is approved for "+report.getEmployeeName());
        }
        else{
            System.out.println("Report is rejected for "+ report.getEmployeeName());
        }
    }
}