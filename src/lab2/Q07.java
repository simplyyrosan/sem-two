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
