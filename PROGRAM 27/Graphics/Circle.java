package Graphics;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
