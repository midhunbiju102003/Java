package Graphics;

public class Traingle {
    double base,height;
    public Traingle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double calculateArea(){
        return 0.5*base*height;
    }
}
