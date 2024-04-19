public class ExpenseReport
{
    private String EmployeeName ;
    private int amount;

    public ExpenseReport(String EmployeeName, int amount)
    {
        this.EmployeeName = EmployeeName;
        this.amount = amount;
    }
   
   public String getEmployeeName()
   {
    return EmployeeName;
   }
   public int getAmount()
   {
    return amount;
   }

}
