package practice;

import java.util.Scanner;

public class SwitchMenuDriven {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("MENU");
		System.out.println(".............");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MULTIPLY");
		System.out.println("DIVIDE");
		
		System.out.println("enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("enter option in words");
		String str=sc.next();
		 switch(str) {
		case "ADD":{
			int ans=x+y;
			System.out.println(ans);
			break;
		}
		case "SUB":{
			int ans=x-y;
			System.out.println(ans);
			break;
		}case "MULTIPLY":{
			int ans=x*y;
			
			System.out.println(ans);
			break;
		}case "DIVIDE":{
			int ans=x/y;
			System.out.println(ans);
			break;
		
		}
		default:{
			System.out.println("invalid choice");
		}
		}
	}

}
