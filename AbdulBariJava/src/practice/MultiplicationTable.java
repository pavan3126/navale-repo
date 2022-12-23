package practice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int i,n=0;
		System.out.println("enter the number");
		n=sc.nextInt();
		/*for( i=1;i<=10;i++) {
			System.out.println(n*i);
		}*/
		int sum=0;
		for(i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
