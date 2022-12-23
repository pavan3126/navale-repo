package practice.interfaces;
interface Test{
	void  method1();
	void method2();
}
  class Test2 implements Test{
	public void method1() {
		System.out.println("Test2 method1");
	}
	public void method2() {
		System.out.println("Test2 method2");
	}
	public void method3() {
		System.out.println("method 3 of class Test2");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Test t=new Test2();
		 t.method1();
		 t.method2();
		  

	}

}
