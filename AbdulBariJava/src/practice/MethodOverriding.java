package practice;
class super2{
	public void display() {
		System.out.println("super class display");
	}
}
class sub2 extends super2{
	
	public void display() {
		System.out.println("inside sub class");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
	super2 sup=new sub2();
sup.display();
	}

}
