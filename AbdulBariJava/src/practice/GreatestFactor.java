package practice;

public class GreatestFactor {
           static int gratestFactor(int n,int m) {
        	  
        	  while(m!=n) {
        		  if(m>n) {
        		  m=m-n;
        		  } 
        		  else {
        			  n=n-m;
        		  }
        		  
        	  }	  
        	  
			return m;
        	  
          }
	public static void main(String[] args) {
		System.out.println(gratestFactor(20,50
				));

	}

}
