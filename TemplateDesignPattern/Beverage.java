public abstract class Beverage
{
    //Abstract Template method defining the steps to prepare the beverage
    public final void prepareBeverage()
    {
        boilWater();
        brew();
        pourInCup();
         addCondiments();
    }
     
     //Abstract method to be implemented by subclasses.
    public abstract void brew();
    public abstract void addCondiments();  


    //Common methods implemented in the base class.
    public void boilWater()
    {
        System.out.println("Boiling Water");
    }

    public void pourInCup()
    {
        System.out.println("Pouring in a cup");
    }

}