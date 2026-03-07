package lab1;

/*
Name: Omm Prakash Rout
Serial number: 41, O3
App. Number: 25E118B49
*/

class Point {
	double xco, yco;
	
	Point(double xco, double yco) {
		this.xco = xco;
		this.yco = yco;
	}
	
}

class DistanceDemo {
	
	public static double Distance(Point p1, Point p2) {
		double x = p2.xco - p1.xco;
		double y = p2.xco - p1.xco;
		return Math.sqrt(x*x + y*y);
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(2, 4);
		Point p2 = new Point(5, 6);
		
		double dist = Distance(p1, p2);
		System.out.println("Distance between point: " + dist);
	}
}
