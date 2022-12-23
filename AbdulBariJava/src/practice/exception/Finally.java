package practice.exception;

public class Finally {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} 
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("hii from finally block");
		}
	}

}
