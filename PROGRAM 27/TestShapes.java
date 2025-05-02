import Graphics.Rectangle;
import Graphics.Traingle;
import Graphics.Square;
import Graphics.Circle;

public class TestShapes{
    public static void main(String[] args){
        Rectangle rectangle=new Rectangle(5, 3);
        Traingle traingle=new Traingle(4, 6);
        Square square=new Square(4);
        Circle circle=new Circle(3);

        System.out.println("Area of Rectangle:"+rectangle.calculateArea());
        System.out.println("Area of Traingle:"+traingle.calculateArea());
        System.out.println("Area of Square:"+square.calculateArea());
        System.out.println("Area of Circle:"+circle.calculateArea());

    }
}