
import java.util.Scanner;


public class Palidrome {
    public static void main(String[] args) {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        str = sc.nextLine();
        sc.close();

        int length = str.length();

        for (int i = length -1; i >=0; i--){
            rev = rev + str.charAt(i);

        }
        if (str.equals(rev)){
            System.err.println(str + " is a palindrome.");
        }else{
            System.err.println(str + " is not a palidrome.");
        }
    }
}
