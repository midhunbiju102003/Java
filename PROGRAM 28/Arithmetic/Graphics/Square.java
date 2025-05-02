package Graphics;

public class Square {
    double side;

    public Square(double side){
        this.side=side;
    }
    
    public double calculateArea(){
        return side*side;
    }
}
