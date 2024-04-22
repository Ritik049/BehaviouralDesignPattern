import java.util.*;
public class AreaCalculator implements Visitor{
    @Override
    public void visit(Circle circle)
    {
        double area = Math.PI*circle.getRadius()*circle.getRadius();

        System.out.println("Area of circle "+ area);
    }

    @Override
    public void visit(Square square)
    {
        double area = square.getSide()*square.getSide();
        System.out.println("Area of Square "+area);
    }
}