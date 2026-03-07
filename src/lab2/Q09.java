package lab2;
class Employee {
    private String name;
    private double salary;

    Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayEmployeInfo() {
        System.out.println(name + " " + salary);
    }
}

class Manager extends Employee {
    String department;
    Manager(String department, String name, double salary) {
        super(name, salary);
        this.department = department;
    }
    
    void displayManagerDetails() {
        
        super.displayEmployeInfo();
        System.out.println(department);
    }
    
    
}
public class Q09 {
    public static void main(String[] args) {
        Manager ob = new Manager("Sex Offender", "Shrijan", 2344);
        ob.displayManagerDetails();
    }

}
