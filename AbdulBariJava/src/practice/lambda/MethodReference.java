package practice.lambda;
interface Lambdaa{
	public void display(String str);
	
}
public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lambdaa l=System.out::println;
l.display("ycp");
	}

}
