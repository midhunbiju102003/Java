public class Strings {
    public static void main(String[] args) {
        String str = "Java Programming";
        
       
        System.out.println("The string is: " + str);
        
        
        System.out.println("Length of the String is: " + str.length());
        
        
        System.out.println("Character at second and fourth position is: " + str.charAt(1) + ", " + str.charAt(3));
        
        
        System.out.println("The substring using start index only is: " + str.substring(5));
        
        
        System.out.println("The substring using start and end index is: " + str.substring(0, 4));
       }
}