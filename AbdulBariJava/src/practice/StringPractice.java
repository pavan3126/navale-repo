package practice;

public class StringPractice {

	public static void main(String[] args) {
		/*String str="Mr.james gosling"; 
		System.out.println(str.endsWith("jame" ));
		System.out.println(str.charAt(4));
		for(int i=0;i<str.length();i++ )
		System.out.print(str.charAt(i)) ;
		  
		System.out.println((str.indexOf( ".")));
		*/
       /*  String str1="Javase";
        String str2="javase";
        String str3=new String("Javase");
        System.out.println( str1.endsWith(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
		 System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		if(str1==str3) {//here checks Addresses
			System.out.println("trueeee");
		}
		System.out.println("falseeeee");
		
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str3));
		*/
		/*String str1="cricket has only one ";
		String str2="god that is sachin tendulkar";
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
		*/
		
	//	String str1="p1";
		//System.out.println(str1.matches("[a-z][0-9]"));
	/* String str="abc 6def";
	 System.out.println(str.matches("[a-z]*"));
	 
	 String str2="abzsdfgcz";
	 System.out.println(str2.matches("[abz]*"));
	 System.out.println("...........");
	 String str3="vito@gmail.com";
	 System.out.println(str3.matches("\\w*@gmail(.*)"));
	 
	 */
	/*	 String str="programmer@gmail.com";
		System.out.println(str.substring(0, 10));
		 System.out.println(str.substring(11,str.length()));
		*/
		//int a= 1001010;
		//String str =a+"";
		/*String str2=String.valueOf(a);
		System.out.println(".......");
		System.out.println(str2.matches("[01]*"));
		*/
		String str="a!b@c#1$2%3";
	     System.out.println(str.replaceAll("[^a-zA-z0-9]", " "));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
 
}
