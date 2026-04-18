/*
Define a class Car with two instance variables: model and year
Two member methods are:
• setDetails(): Set the details of the car.
• displayDetails(): Display the details of the car.
Now, create two objects of the Car class:
• Initialize the first object's values directly (by using the dot. operator) with model: "Toyota" and year:
2020.
• Accept the model and year through the keyboard input and set them to another object using the
setDetails() method.
Now, display the details of both cars using the displayDetails() method.
Also, check which car is newer.
 */

package lab2;

import java.util.Scanner;

class Car {
    String model;
    int year;

    void setDetails() {
        Scanner sc = new Scanner(System.in);
		System.out.println("Entet model: ");
		model = sc.nextLine();
		System.out.println("Enter year: ");
		year = sc.nextInt();
		sc.close();
    }

    void displayDetails() {
		System.out.println("Model is " + model + " year is "+year);
    }
}

public class Q01 {

	public static void main(String[] args) {

		Car ob1 = new Car();
		ob1.model = "Toyota";
		ob1.year = 2020;
		
		Car ob2 = new Car();
		ob2.setDetails();
		
		ob1.displayDetails();
		ob2.displayDetails();
		
		System.out.println(((ob1.year>ob2.year) ? ob1.model : ob2.model) + " is newer." );
	}
    
}
