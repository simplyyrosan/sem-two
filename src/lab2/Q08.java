/*
Define two interfaces, Flyable and Swimmable, with the following methods:
Interface Flyable:
• A method fly () (e.g., "Flying not flying").
Interface Swimmable:
• A method swim () (e.g., "Swimming or not swimming").
Define a class Duck that implements both Flyable and Swimmable interfaces. This class should:
• Implement the fly () method from Flyable interface.
• Implement the swim () method from Swimmable interface.
• Include an additional instance variable name (a String) to store the name of the duck, initialized
through the constructor.
• A displayDetails() method to display the duck's name and its capabilities (whether it can fly or
swim).
Write a program to:
• Create an object of Duck and initialize its name.
• Call the fly() and swim() methods using the Duck object.
• Display the duck's name and its abilities using the displayDetails() method.
 */

package lab2;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    String name;

    Duck(String name) {
        this.name = name;
    }

    // Implement fly() method
    public void fly() {
        System.out.println(name + " is flying.");
    }

    // Implement swim() method
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Duck Name: " + name);
        System.out.println("Can Fly: Yes");
        System.out.println("Can Swim: Yes");
    }

}

public class Q08 {
    public static void main(String[] args) {
        
        // Create Duck object
        Duck d1 = new Duck("Donald");

        // Call methods
        d1.fly();
        d1.swim();

        // Display details
        d1.displayDetails();
    }
}
