package practice.exception;
class StackOverFlowException extends Exception{
	public String toString() {
		return"stack is full";
	}
}
class StackUnderFlowException extends Exception{
	public String toString() {
		return "stack is empty";
	}
}
 class Stack{
	private int size;
	private int top=-1;
	private int arr[];
	public Stack(int size) {
		super();
		this.size = size;
		arr=new int [size];
	}
	public void push(int x)throws StackOverFlowException{
		if(top==size-1) {
			throw new StackOverFlowException();
		}
		top++;
		arr[top]=x;
	}
	public int pop()throws StackUnderFlowException 
	{
		int x=-1;
		if(top==-1)
	throw new StackUnderFlowException();
		x=arr[top];
		top--;
		return x;
	
	}
}
public class StudentChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack(5);
try {
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(20);
	s.push(20);
	s.push(20);
	
}catch(StackOverFlowException e) {
	System.out.println(e);
}
	}

}
