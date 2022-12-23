package practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int Ono=n;
		int sum=0,rem;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
		}
		System.out.println(sum);
		if(Ono==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
