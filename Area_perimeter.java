import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
}
    public double area() {
    return length * width;
    }
    public double perimeter() {
    return 2 * (length + width);
    }
}

public class Area_perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            System.out.println("\nMenu");
            System.out.println("1. Calculate Circle");
            System.out.println("2. Calcualte Rectangle");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice:");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of Circle: " + circle.area());
                System.out.println("Perimeter of Circle: " + circle.perimeter());
                break;
                case 2:
                System.out.println("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.println("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area of Rectangle: " + rectangle.area());
                System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
                break;
                case 3:
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
                break;
                default:
                System.out.println("Invalid Choice");
                break;


            }
        }
    }
}

//Menu
//1. Calculate Circle
//2. Calcualte Rectangle
//3. Exit
//Enter your Choice:
//2
//Enter the length of the rectangle: 
//5
//Enter the width of the rectangle:
//6
//Area of Rectangle: 30.0
//Perimeter of Rectangle: 22.0

//Menu
//1. Calculate Circle
//2. Calcualte Rectangle
//3. Exit
//Enter your Choice:
//3
//Exiting...