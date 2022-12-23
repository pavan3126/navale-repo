package practice.innerclass;
abstract class my{
	abstract void display();
}
class Outerr{
	public void method() {
		my m =new my() {
			public void display() {
				System.out.println("abstract method overrided");
			}
		};
		m.display();
	}
}

public class AnonymousMain {

	public static void main(String[] args) {
		
Outerr o= new Outerr();
o.method();
	}

}
