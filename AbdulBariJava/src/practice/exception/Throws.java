package practice.exception;

class NegativeDimensionException extends Exception
{
	public String toString() {
		return"dimension cannot be negative";
	}
}
public class Throws {
	static int area(int l,int b)throws Exception
	{
		if(l<0||b<0) {
			throw new NegativeDimensionException();
		}
		return l*b;
	}
	static void method1() throws Exception
	{
		int area=area(-10,5);
		System.out.println(area+"  is the area");
	}

	public static void main(String[] args) {
		try {
		method1();
	}catch(Exception p) {
		System.out.println(p);
	}
		}

}
