import java.util.Scanner;

class Shape {
    // Method to calculate the area of a circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0; // Return 0 if not a triangle (this case won't be used in the main method)
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        
        // Circle area
        System.out.println("Enter radius of circle:");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + shape.area(radius));
        
        // Rectangle area
        System.out.println("Enter length and width of rectangle:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println("Area of Rectangle: " + shape.area(length, width));
        
        // Triangle area
        System.out.println("Enter base and height of triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + shape.area(base, height, true));
        
        sc.close();
    }
}
