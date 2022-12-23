package practice;
abstract class super12{

	public super12() {
		super();
	System.out.println("inside constructor");

	}
    public void method1() {
		System.out.println("method1 of super class");
	}
	public abstract void method2();
}
class subclass extends super12{
	@Override
	public void method2() {
		System.out.println("inside method2 ofsub class  ");
			
	}
	
}
public class AbstractExample {

	public static void main(String[] args) {
		super12 s=new subclass();
		s.method1();
		s.method2();

	}

}
