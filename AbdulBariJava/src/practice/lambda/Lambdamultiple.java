package practice.lambda;
interface Mylambda2{
	public int add(int x,int y); 
}
public class Lambdamultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mylambda2 m=(a,b)->{
	return a+b;
};
	
System.out.println(m.add(20, 30));
	}

}
