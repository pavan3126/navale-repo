package practice.staticV;

class A {
	static int x = 10;
	int y = 20;

	void show() {
		System.out.println(x);
		System.out.println(y);
	}

	static void display() {
		System.out.println(x);
		// System.out.println(y);
	}
}

public class Staticvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.show();
		A.display();
	}

}
