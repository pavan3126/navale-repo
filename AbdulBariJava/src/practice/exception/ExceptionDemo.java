package practice.exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int a , b , c;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 2 numbers");
		        a=sc.nextInt();
			    b=sc.nextInt();

			c = a / b;
			System.out.println("divion is"+c);
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero,try again" + e);
		}
		System.out.println("bye");

	}

}
