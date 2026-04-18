/*
Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a java program to
display area of different shapes.
 */

package lab2;
import java.util.Scanner;

// Abstract class
abstract class Shape {
    abstract double calculateArea();
}

// Derived class: Square
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }
}

// Derived class: Triangle
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Derived class: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Shape square = new Square(side);
        System.out.println("Area of Square: " + square.calculateArea());

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        Shape triangle = new Triangle(base, height);
        System.out.println("Area of Triangle: " + triangle.calculateArea());

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.calculateArea());

        sc.close();
    }
}


//watermelon, orange, promogranate, grapes, raw mango, gauava 
//apples x 
