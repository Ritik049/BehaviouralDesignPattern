public class Client
{
    public static void main(String [] args)
    {
        Shape circle = new Circle(5);
        Shape square = new Square(10);

        //Create Visitor
        Visitor areaCalculator = new AreaCalculator();

        //Use the visitor to calculate area
        circle.accept(areaCalculator);
        square.accept(areaCalculator);

        //In class accpepting the visitor , along visitor as argument in accept function , 
        //we tend to run the actual work (method) which we want visitor does in class itself
        //Like here accpet-->visitor.visit(this);

        //ClassA is accepting visitor  
        //Visitor is visiting classA  (classA comes in visitor mainExecutable function argument);
    }
}