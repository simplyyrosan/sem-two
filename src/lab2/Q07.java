/*
Define a base class Shape with an instance variable color. The instance variable is initialized through the
constructor. The prototype of the constructor is as below: Shape (String)
Define two derived classes Circle and Rectangle, both inheriting from the Shape class.
Class Circle:
• Has an additional instance variable radius, initialized through the constructor.
• The constructor prototype is: Circle (String, double)
• A method area () to calculate the area of the circle: π * radius2.
Class Rectangle:
• Has two additional instance variables length and width, initialized through the constructor.
• The constructor prototype is: Rectangle (String, double, double)
• A method area () to calculate the area of the rectangle: length * width.
Both the Circle and Rectangle classes should have a method display () to display the shape's details,
including color and the area of the respective shape.
Write a program to:
1. Create objects for both Circle and Rectangle.
2. Initialize their properties.
3. Display their details using the display () method.
 */

package lab2;

class Shape {
    String color;
    
    Shape(String color) {
        this.color = color;
    }
}

class Circle extends Shape {

    double radius;
    double area;

    Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }

    void area() {
        area = Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Color: " + color + "\nArea: " + area);
    }
}

class Rectangle extends Shape {

    double length;
    double width;
    double area;

    Rectangle (String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    void area() {
        area = length*width;
    }

    void display() {
        System.out.println("Color: " + color + "\nArea: " + area);
    }
}



public class Q07 {
    public static void main(String[] args) {
        //Circle ob1 = new Circle("Red", 4);
        Rectangle ob2 = new Rectangle("Yellow", 4, 5);
        //ob1.area();
        ob2.area();
        //ob1.display();
        ob2.display();
    }
}
