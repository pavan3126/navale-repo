package practice;
class rectangle2{
	int length;
	int breadth;
	int x=10;
	public rectangle2(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
}
class cuboid extends rectangle2{
int height;
int x=20;

public cuboid(int length, int breadth, int height) {
	super(length, breadth);
	this.height = height;
}
	void display() {
		System.out.println(super.x);
		System.out.println(x);
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cuboid c=new cuboid(70,80,90);
c.display();
	}

}
