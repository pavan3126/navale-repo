package practice.io.read;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputExample {

	public static void main(String[] args) throws Exception {
		 FileInputStream fis=new FileInputStream("C:\\Users\\Shree\\Desktop\\javafile.txt");
		BufferedInputStream bis=new BufferedInputStream(fis); 
 int x;
		while((x=bis.read())!=-1) {
			System.out.print((char)x);
		} 
		
		System.out.println("\n"+fis.markSupported());
		System.out.println(bis.markSupported());
	}

}
