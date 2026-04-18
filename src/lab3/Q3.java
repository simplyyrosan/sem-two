package lab3;

class MarksOutOfBoundException extends Exception {
	MarksOutOfBoundException(String msg) {
		super(msg);
	}
}

class Student {
	int mark;
	String name;
	
	Student (int mark, String name) throws MarksOutOfBoundException{
		if (mark > 100) 
			throw new MarksOutOfBoundException("Marks can't be more than 100");
		this.mark = mark;
		this.name = name;
	}

	void display() {
		System.out.println("Name: " + name + "\nMark: " + mark);
	}
} 

public class Q3 {

	public static void main(String[] args) {
		try {
			Student ob1 = new Student(90, "Ram");
			ob1.display();
		} catch (MarksOutOfBoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
