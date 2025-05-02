package Graphics;

public class Rectangle {
    double length,breadth;

    public Rectangle(double len,double wid){
        length=len;
        breadth=wid;
    }
public double calculateArea(){
    return length*breadth;
}   
}
