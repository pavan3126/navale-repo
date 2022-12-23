package practice;

public class Switch {

	public static void main(String[] args) {
		/*int n =2;
		if(n==1) {
			System.out.println("one");
		}
		else if(n==2) {
			System.out.println("two");
		}
		else if(n==3) {
			System.out.println("three");
		}
		else {
			System.out.println("invalid");
		}
		*/
		
		int n=3;
		switch(n) {
		case 1:{
			System.out.println("one");
		break;
		}
		case 2:{
			System.out.println("two");
		break;
		}
		case 3:{
			System.out.println("three");
		break;
		}
		default: {
			System.out.println("invalid"); 
			
		}
		
		}
	}
	

}
