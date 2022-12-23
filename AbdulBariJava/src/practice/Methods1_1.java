package practice;

public class Methods1_1 {
    int max(int x,int y) 
	{
		
		if(x>y)
		return x;
		else
			return y;
		
	}
 
	public static void main(String[] args) {
		
int a=10;int b=30;int c;;
Methods1_1 method=new Methods1_1();
 c=method.max(a, b);
 System.out.println(c);
//System.out.println(max(a,b));to run this method should be static
	}

}
