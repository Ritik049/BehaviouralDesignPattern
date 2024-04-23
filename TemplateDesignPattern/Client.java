public class Client{
    public static void main(String[]args)
    {
        Beverage coffee = new Coffee();
        System.out.println("Making coffee");
        coffee.prepareBeverage();

        System.out.println();
        
        Beverage tea = new Tea();
        System.out.println("Making tea");
        tea.prepareBeverage();

    }

    //HERE we are making templates which follow some common methods. and some abstract method(which is neccessary to be in all classes but with different implementation);
}