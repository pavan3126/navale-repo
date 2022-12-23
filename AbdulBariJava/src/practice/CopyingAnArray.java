package practice;

public class CopyingAnArray {

	public static void main(String[] args) {
		int A[]= {1,2,3,4,5,6,7,8,9};
		int b[]=new int[10];
		for(int i=0;i<A.length;i++) {
			b[i]=A[i];
		}
          for(int x:b)
        	  System.out.println(x );
	}

}
