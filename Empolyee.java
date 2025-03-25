import java.util.*;

class Employee {
    int eNo;
    String eName;
    int eSalary;

    public void read(Scanner sc) {
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
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[n];

        for (i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].read(sc);
        }

        System.out.println("Search Employee (Enter -1 to Exit):");
        while (true) {
            System.out.print("Enter ID: ");
            int No = Integer.parseInt(sc.nextLine());

            if (No == -1) {
                System.out.println("Exiting...");
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
                System.out.println("Employee not found!");
            }
        }
        sc.close();
    }
}
