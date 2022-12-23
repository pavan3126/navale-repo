package practice;
class rectangle{
	int length;
	int breadth;
	public rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	void display() {
		System.out.println(length);
		System.out.println(breadth);
	}
}
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle r=new rectangle(10,20);
r.display();
	}

}
