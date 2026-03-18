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
