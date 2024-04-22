public class Circle implements Shape{
    
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    @Override
    public void accept(Visitor visitor)
    {
            visitor.visit(this);                //Leaving a scope for visitor, to come and add its functionality;
    }
}