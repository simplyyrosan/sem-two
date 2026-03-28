package lab3;
import java.util.*;

class NumberFormatException extends Exception {
	NumberFormatException(String msg) {
		super(msg);
	}
}

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your lucky number: ");
		int n = sc.nextInt();
		
		try {
			if (n<0)
				throw new NumberFormatException("Number cant be negative.");
			else
				System.out.println("Your lucky number is " + n);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
