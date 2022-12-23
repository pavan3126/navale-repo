package practice;

import java.util.Scanner;

public class ReverseAndPalindrome {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ono=n;
		int rev=0,r;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
		if(ono==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
