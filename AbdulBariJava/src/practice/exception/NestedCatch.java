package practice.exception;

public class NestedCatch {

	public static void main(String[] args) {
		try {
			int[] a = { 10, 1, 3, 4, 5, 0 };
			int c = a[0] / a[5];
			System.out.println(c);
			try {
				System.out.println(a[4]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("array size exeeded" + e);

			}
		} catch (ArithmeticException e) {
			System.out.println("denominator should not be zero" + e);
		}
		System.out.println("come to last statement");
	}

}
