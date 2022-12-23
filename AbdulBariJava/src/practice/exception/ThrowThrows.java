package practice.exception;

public class ThrowThrows {

	static int method1() {
		return 10 / 0;
	}

	static void method2() {
		int r=method1();
		System.out.println(r);
	}

	static void method3() {
		method2();
	}

	public static void main(String[] args) {
		try	{	
		method3();
	
		}catch(Exception e) {
			System.out.println(e);
		}

}
} 