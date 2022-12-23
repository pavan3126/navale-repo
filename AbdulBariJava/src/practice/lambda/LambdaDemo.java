package practice.lambda;

@FunctionalInterface
interface Mylambda {
	public void display();
}
class Demo{
	public void method1() {
		int count=0;
		Mylambda m=()->{
			 System.out.println("hii");
			 System.out.println(count);
	};
	
	}
}
/*class My implements Mylambda {
 
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("in display method");
	}

}*/

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mylambda m = new Mylambda() {
//			public void display() {
		//Mylambda m=(s)->{
			//	0System.out.println(s);
			
		};
		//m.display("luv u cdac");
	

}
 