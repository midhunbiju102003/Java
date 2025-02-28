import java.util.Scanner;

public class Complex {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of first complex number:");
        double real1=sc.nextDouble();
        double img1=sc.nextDouble();

        System.out.print("Enter real and imaginary part of second complex number:");
        double real2=sc.nextDouble();
        double img2=sc.nextDouble();

        double sumreal = real1+real2;
        double sumimg = img1+img2;
        System.out.println("Sum="+sumimg+"+"+sumreal+"i");
        sc.close();
    }
    
}
#Enter the real and imaginary part of first complex number:3.5 2.5
#Enter real and imaginary part of second complex number:1.5 4.0
#Sum=6.5+5.0i
