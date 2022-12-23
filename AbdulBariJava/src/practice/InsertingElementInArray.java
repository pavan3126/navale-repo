package practice;

public class InsertingElementInArray {

	public static void main(String[] args) {
		int[]a=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
         
		int n=6;
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
	
}int x=20;
int index=2;
		for(int i=n;i>index;i--) 
			a[i]=a[i-1];
			a[index]=x;
		
		System.out.println("................");
			for(int i=0;i<n;i++) {
				System.out.println(a[i]);
		
			}	
		}
		
		
	
	
	

}
