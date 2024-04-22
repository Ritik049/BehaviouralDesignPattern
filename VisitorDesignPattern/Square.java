public class Square implements Shape{

    private double side;

    public Square(double side)
    {
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}