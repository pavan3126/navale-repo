package practice;

import java.util.Scanner;

public class Progression {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int a,d,n;
		n=sc.nextInt();
		a=sc.nextInt();
		d=sc.nextInt();
		int term=a;
		for( int i=0;i<n;i++) {
			
			 System.out.println(term+",");
			 term=term+d;
		}
       
	}

}
