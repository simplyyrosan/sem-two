/*
Define a class called Complex with instance variables real, imag and instance methods
• void setData ()
• void display ()
• public Complex add (Complex, Complex)
Write the main method in a separate class to implement the addition of two complex number with the given
method signature as above.
 */

package lab2;

import java.util.*;

class Complex {
	int real;
	int imag;
	
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real: ");
		real = sc.nextInt();
		System.out.print("Enter imag: ");
		imag = sc.nextInt();
	}
	
	void display() {
		System.out.println(real + "+" + imag+"i");
	}
	
	public Complex add(Complex ob1, Complex ob2) {
		Complex ob3 = new Complex();
		ob3.real = ob1.real + ob2.real;
		ob3.imag = ob1.imag + ob2.imag;
		
		return ob3;
	}

}



public class Q02 {
	

	public static void main(String[] args) {
		
		Complex ob1 = new Complex();
		Complex ob2 = new Complex();
		
		ob1.setData();
		ob1.display();
		
		ob2.setData();
		ob2.display();
		
		Complex ob3 = new Complex();
		
		ob3 = ob3.add(ob1, ob2);
		
		ob3.display();
		
	}

}
