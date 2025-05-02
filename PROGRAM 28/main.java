import Arithmetic.*;
 
public class main {

    public static void main(String[] args){
        int num1=20, num2=10;

        Add add=new Add();
        Substract sub=new Substract();
        Multiply mul=new Multiply();
        Divide div=new Divide();

        System.out.println("Addition:"+add.add(num1,num2));
        System.out.println("Substraction:"+sub.subtract(num1,num2));
        System.out.println("Multiplication:"+mul.multiply(num1,num2));
        System.out.println("Division:"+div.divide(num1,num2));

    }
}                                                   