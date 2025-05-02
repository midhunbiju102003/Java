package Arithmetic;

public class Divide implements Division {
    public double divide(int a,int b){
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return(double)a/b;
    }
    
}
