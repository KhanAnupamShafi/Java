package lab02;

public class MyPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Test program to test all constructors and public methods
		MyPoint p1 = new MyPoint();  // Test constructor
		System.out.println(p1);      // Test toString()
		p1.setX(8);   // Test setters
		p1.setY(6);
		System.out.println("x is: " + p1.getX());  // Test getters
		System.out.println("y is: " + p1.getY());
		p1.setXY(3, 0);   // Test setXY()
		System.out.println(p1.getXY()[0]);  // Test getXY()
		System.out.println(p1.getXY()[1]);
		System.out.println(p1);

		MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
		System.out.println(p2);
		// Testing the overloaded methods distance()
		System.out.println(p1.distance(p2));    // which version?
		System.out.println(p2.distance(p1));    // which version?
		System.out.println(p1.distance(5, 6));  // which version?
		System.out.println(p1.distance());      // which version?
		
		MyPoint[] points = new MyPoint[10];  // Declare and allocate an array of MyPoint
		for (int i = 0; i < points.length; i++) {
		   points[i] = new MyPoint(i,i);    // Allocate each of MyPoint instances
		}
		
		for (int i = 0; i < points.length; i++) {
			   System.out.println("Point no "+ i + " : " +points[i]);
			}
		
		System.out.println("----------Circle-------");
		MyCircle c1 = new MyCircle();  // Test constructor
		System.out.println(c1);      // Test toString()
		c1.setCenterX(8);   // Test setters
		c1.setCenterY(6);
		
		System.out.println("x is: " + c1.getCenterX());  // Test getters
		System.out.println("y is: " + c1.getCenterX());
		c1.setCenterXY(3, 0);   // Test setXY()
		System.out.println(c1.getCenterXY()[0]);  // Test getXY()
		System.out.println(c1.getCenterXY()[1]);
		System.out.println(c1);
		
		MyCircle c2 = new MyCircle(0, 0,5);
		MyCircle c3 = new MyCircle(p1,5);
		
		
		// Testing the overloaded methods distance()
				System.out.println(c1.distance(c1));    // which version?
				System.out.println(c1.distance(c2));    // which version?
				
				MyCircle[] circle = new MyCircle[10];  // Declare and allocate an array of MyPoint
				for (int i = 0; i < circle.length; i++) {
					circle[i] = new MyCircle(i,i,i);    // Allocate each of MyPoint instances
				}
				
				for (int i = 0; i < circle.length; i++) {
					   System.out.println("Circle no "+ i + " : " +circle[i].toString());
					}
				

	}

}
