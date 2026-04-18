/*
Define a base class Vehicle with instance variables model and year. The instance variables are initialized
through constructors. The prototype of the constructor is as below:
    Vehicle (String, int)
Define a derived class Car with additional instance variables carId and price. The instance variables are
initialized through constructors. The prototype of the constructor is as below:
    Car (String, int, int, double)
Another instance method of the Car class is carDisplay () to display the information of car details.
Write a program to:
• Create an object of the Car class and initialize its values.
• Display both the base class (Vehicle) and derived class (Car) details using the carDisplay () method
 */

package lab2;

class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int carid;
    double price;

    Car(String model, int year, int carid, double price) {
        super(model, year);
        this.price = price;
        this.carid = carid;
    }

    void CarDisplay() {
        System.out.println("Model: " + model + "\nYear: " + year + "\nCar id: " + carid + "\nPrice: " + price);
    }
}
public class Q06 {
    public static void main(String[] args) {
        Car car1 = new Car("Suzuki", 2031, 69, 200000);
        car1.CarDisplay();

    }
}
