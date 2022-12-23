package practice.abstracts;

abstract class Shape {
	abstract public double perimeter();

	abstract public double area();
}

class Circle extends Shape {
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double perimeter() {
		return 2*3.14*radius;

	}

	public double area() {

		return 3.14*radius*radius;

	}
}

class Rectangle extends Shape {
	double length;
	double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double perimeter() {

		return 2 * (length * breadth);
	}

	@Override
	public double area() {

		return length * breadth;
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Rectangle r = new Rectangle();
//		r.length=10;
//		r.breadth=20;
//		double area = r.area();
//		System.out.println("area of rectangle is" + area);
//		double perimeter = r.perimeter();
//		System.out.println("perimeter" + perimeter);
//		Circle c = new Circle();
//		c.radius=10; 
//		System.out.println("the area of circle is" + c.area());
//		System.out.println("the perimeter of circle is" + c.perimeter());
	
	Shape s=new Rectangle(10.0,20.0);
	

	System.out.println(s.area());
	System.out.println(s.perimeter());
	}

}
