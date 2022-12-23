package practice.exception;

class LowBalanceException extends Exception{
	public String toString() {
		return "balance should not be less than 5000";
	}
	
}
public class Checked {
	static void fun1() {
		try {
		throw new LowBalanceException();
	}catch(LowBalanceException e) {
		System.out.println(e.toString());
	}
		
	}
	static void fun2() {
		
		fun1();
	}

	static void fun3() {
		fun2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
fun3();
	}

}
