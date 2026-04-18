package lab3;

class Box<T> {
	private T x;
	Box(T x) {
		this.x = x;
	}
	
	void get() {
		System.out.println(x);
	}
	
}
public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> ob1 = new Box<>("Box1");
		ob1.get();
	}

}

