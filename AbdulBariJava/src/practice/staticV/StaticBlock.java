package practice.staticV;

public class StaticBlock {
	static {
		System.out.println("block 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" main");
	}

	static {
		System.out.println("block 2");
	}
}
