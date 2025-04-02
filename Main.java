class Main {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[2];
        
        teachers[0] = new Teacher("1", "Alice", "123 Street", 50000, "Computer Science", "Java");
        teachers[1] = new Teacher("2", "Bob", "456 Avenue", 55000, "Mathematics", "Algebra");
        
        teachers[0].display();
        teachers[1].display();
    }
}

class Employee {  // Renamed for clarity
    String Empid;
    String Name;
    String Address;
    int Salary;

    Employee(String id, String name, String addr, int salary) {
        this.Empid = id;
        this.Name = name;
        this.Address = addr;
        this.Salary = salary;
    }

    void display() {
        System.out.println("EmpID       : " + this.Empid);
        System.out.println("Name        : " + this.Name);
        System.out.println("Address     : " + this.Address);
        System.out.println("Salary      : " + this.Salary);
    }
}

class Teacher extends Employee {  
    String Department;
    String Subject;

    Teacher(String id, String name, String addr, int salary, String dept, String subj) {
        super(id, name, addr, salary);
        this.Department = dept;
        this.Subject = subj;
    }

    void display() {
        System.out.println("------------------------------------------------");
        super.display();
        System.out.println("Department  : " + this.Department);
        System.out.println("Subject     : " + this.Subject);
        System.out.println("------------------------------------------------");
    }
}