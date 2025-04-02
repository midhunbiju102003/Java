import java.util.*;

class Employee {
    int eNo;
    String eName;
    int eSalary;

    
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name: ");
        eName = sc.nextLine();
        System.out.print("Enter monthly salary: ");
        eSalary = Integer.parseInt(sc.nextLine());
    }

    
    public void display() {
        System.out.println("Name: " + eName);
    }

    public static void main(String[] args) {
        int i, n = 3;
        int No;
        
       
        Employee emp[] = new Employee[n];

        
        for (i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].read();
        }

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Search for an Employee");

        while (true) {
            System.out.print("Enter ID to search (or -1 to exit): ");
            No = Integer.parseInt(sc.nextLine());

            if (No == -1) {
                System.out.println("Exiting the search.");
                break;
            }

            boolean found = false;
            for (i = 0; i < n; i++) {
                if (emp[i].eNo == No) {
                    emp[i].display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee with ID " + No + " not found.");
            }
        }
    }
}
