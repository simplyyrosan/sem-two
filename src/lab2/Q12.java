/*
Define a base class Person with instance variable name, age.
The instance variables are initialized through constructors. The prototype of constructor is as below.
Person (String, int)
Define a derived class Employee with instance variables Eid, salary.
The instance variables are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double).
Another instance method of Employee class is empDisplay() to display the information of employee details.
 */

package lab2;

// Base class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Derived class
class Employee extends Person {
    int Eid;
    double salary;

    // Constructor
    Employee(String name, int age, int Eid, double salary) {
        super(name, age);  // call base class constructor
        this.Eid = Eid;
        this.salary = salary;
    }

    // Method to display employee details
    void empDisplay() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + salary);
    }
}


// Main class
public class Q12 {
    public static void main(String[] args) {

        // Create Employee object
        Employee emp1 = new Employee("Rahul", 25, 101, 50000.0);

        // Display details
        emp1.empDisplay();
    }
}


