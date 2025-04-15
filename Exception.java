import java.util.Scanner;

// Custom exception for username error
class UsernameException extends Exception {
    public UsernameException(String msg) {
        super(msg);
    }
}

// Custom exception for password error
class PasswordException extends Exception {
    public PasswordException(String msg) {
        super(msg);
    }
}

public class DemoExcp {
    public static void main(String[] args) {
        String name = "nidhi";
        String pass = "nidhips";
        Scanner s = new Scanner(System.in);

        int attempts = 0;
        boolean success = false;

        while (attempts < 3 && !success) {
            System.out.print("Enter username :: ");
            String user = s.nextLine();
            System.out.print("Enter password :: ");
            String pwd = s.nextLine();

            try {
                if (!user.equals(name)) {
                    throw new UsernameException("Username incorrect");
                } else if (!pwd.equals(pass)) {
                    throw new PasswordException("Password incorrect");
                } else {
                    System.out.println("Login Successful!!!");
                    success = true;
                }
            } catch (UsernameException | PasswordException e) {
                System.out.println("Error: " + e.getMessage());
                attempts++;
                if (attempts < 3) {
                    System.out.println("Please try again. Attempts left: " + (3 - attempts));
                }
            }
        }

        if (!success) {
            System.out.println("Account locked due to too many failed attempts.");
        }

        s.close();
    }
}
