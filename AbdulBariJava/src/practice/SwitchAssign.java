package practice;

import java.util.Scanner;

public class SwitchAssign {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter domain name");
		String domain=sc.nextLine();
 		//String domain="google.com";
		String ext=domain.substring(domain.lastIndexOf(".")+1);
 		switch(ext){
 			case "com":
 				System.out.println("commercial");
 				break;
 		
 		    case "gov":
 		    	System.out.println("govrnmrnt");
 		    	break;
	}

}
	}
