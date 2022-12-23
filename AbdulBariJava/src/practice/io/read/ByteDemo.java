package practice.io.read;

import java.io.ByteArrayInputStream;

public class ByteDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
byte[]b= {'a','b','c','d','e','f','g','h','i','j'};
 ByteArrayInputStream bis=new ByteArrayInputStream(b);
 String str= new String(bis.readAllBytes());
System.out.println(str );
System.out.println(bis.markSupported());
 //int x; 
// while((x=bis.read())!=-1) { 
//	System.out.println((char)x); 
// }
 bis.close();
}
}