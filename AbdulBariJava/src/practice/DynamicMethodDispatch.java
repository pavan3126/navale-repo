package practice;

class Supers1{
	public void method1() {
		System.out.println("inside method 1 of super");
	}

	public void method2() {
		System.out.println("inside method 2 of super");
	}
}

class Sub extends Supers1 {
	@Override
	public void method2() {
		System.out.println("inside method 2 of sub class");
	}

	public void method3() {
		System.out.println("inside sub method 3");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supers1 su=new Sub();
su.method1();
su.method2();
//su.method3()// this is not possible to run sub class method with reference of super class
Sub s=new Sub();
s.method3();

	}

}
