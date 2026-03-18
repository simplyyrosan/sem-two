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
